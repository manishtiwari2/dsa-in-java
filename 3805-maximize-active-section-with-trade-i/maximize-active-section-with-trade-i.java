class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int ones = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                ones++;
            }
        }
        String t = "1" + s + "1";
        ArrayList<Character> type = new ArrayList<>();
        ArrayList<Integer> len = new ArrayList<>();

        int count = 1;
        for(int i=1; i<t.length(); i++){
            if(t.charAt(i) == t.charAt(i-1)){
                count++;
            } else {
                type.add(t.charAt(i-1));
                len.add(count);
                count = 1;
            }
        }
        type.add(t.charAt(t.length() - 1));
        len.add(count);

        int ans = ones;
        for(int i=1; i<type.size()-1; i++){
            if(type.get(i) == '1' && type.get(i-1) == '0' && type.get(i+1) == '0'){
                int gain = len.get(i-1)+len.get(i+1);
                ans = Math.max(ans, ones+gain);
            }
        }
        return ans;
    }
}
