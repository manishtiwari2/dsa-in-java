package striverleetcode.Arrays.medium;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for(int num: nums){
            currSum += num;
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray obj = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

// Approached used: --> KADANE'S Algorithm

//We keep a running sum of the current subarray.
//If extending the subarray reduces the sum, we start fresh from the current element.
//We continuously update the maximum sum found so far.


// Brute force approach

//public int maxSubArray(int[] nums) {
//    int maxSum = Integer.MIN_VALUE;
//    for (int i = 0; i < nums.length; i++) {
//        int currSum = 0;
//        for (int j = i; j < nums.length; j++) {
//            currSum += nums[j];
//            maxSum = Math.max(maxSum, currSum);
//        }
//    }
//    return maxSum;
//}