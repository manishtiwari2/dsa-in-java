class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        int[] lps = buildLPS(needle);
        int left = 0;
        int right = 0;
        while(left < haystack.length()){
            if(haystack.charAt(left) == needle.charAt(right)){
                left++;
                right++;
            }
            if(right == needle.length()){
                return left-right;
            } else if(left<haystack.length() && haystack.charAt(left) != needle.charAt(right)){
                if(right != 0){
                    right = lps[right-1];
                }else {
                    left++;
                }
            }
        }
        return -1;
    }

    private int[] buildLPS(String pattern) {

        int[] lps = new int[pattern.length()];

        int len = 0;
        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}