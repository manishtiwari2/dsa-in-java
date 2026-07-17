class Solution {

    public String countAndSay(int n) {

        String ans = "1";
        for (int i = 2; i <= n; i++) {

            StringBuilder next = new StringBuilder();
            int count = 1;
            for (int j = 1; j < ans.length(); j++) {
                if (ans.charAt(j) == ans.charAt(j - 1)) {
                    count++;
                } else {
                    next.append(count);
                    next.append(ans.charAt(j - 1));

                    count = 1;
                }
            }
            next.append(count);
            next.append(ans.charAt(ans.length() - 1));

            ans = next.toString();
        }

        return ans;
    }
}