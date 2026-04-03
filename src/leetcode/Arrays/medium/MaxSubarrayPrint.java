package leetcode.Arrays.medium;

public class MaxSubarrayPrint {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        int start = 0;
        int arrStart = 0;
        int arrEnd = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                arrStart = start;
                arrEnd = i;
            }
            if (currSum < 0) {
                currSum = 0;
                start = i + 1;
            }
        }
        System.out.print("Maximum Subarray: [ ");
        for (int i = arrStart; i <= arrEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubarrayPrint obj = new MaxSubarrayPrint();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
