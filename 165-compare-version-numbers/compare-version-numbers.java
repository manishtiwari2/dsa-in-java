class Solution {
    public int compareVersion(String version1, String version2) {

        int left = 0;
        int right = 0;
        int m = version1.length();
        int n = version2.length();

        while(left < m || right < n){
            int num1 = 0;
            int num2 = 0;

            while(left<m && version1.charAt(left) != '.') {
                num1 = num1*10 + (version1.charAt(left) - '0');
                left++;
            }
            while(right < n && version2.charAt(right) != '.') {
                num2 = num2*10 + (version2.charAt(right) - '0');
                right++;
            }
            if(num1 < num2){
                return -1;
            }
            if(num1 > num2){
                return 1;
            }
            left++;
            right++;
        }
        return 0;
    }
}