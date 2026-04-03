package leetcode.Arrays.easy;

public class LongestSubArrPos {
        public int findSubArr(int[] nums, int k){
            if (nums.length == 0) return 0;
            int start = 0;
            int end = 0;
            int sum = 0;
            int ans = 0;
            while(end < nums.length){
                sum += nums[end];
                while(sum > k){
                    sum = sum - nums[start];
                    start++;
                }
                if(sum == k){
                    ans = Math.max(ans,end - start + 1);
                }
                end++;
            }
            return ans;
    }

    public static void main(String[] args) {
        LongestSubArrPos obj = new LongestSubArrPos();
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(obj.findSubArr(nums, k));
    }
}


//public int findSubArr(int[] nums, int k) {
//    if (nums.length == 0) return 0;
//    int ans = 0;
//    for (int i = 0; i < nums.length; i++) {
//        int currSum = 0;
//        for (int j = i; j < nums.length; j++) {
//            currSum += nums[j];
//            if (currSum == k) {
//                ans = Math.max(ans, j - i + 1);
//            }
//            if (currSum > k) {
//                break;
//            }
//        }
//    }
//    return ans;