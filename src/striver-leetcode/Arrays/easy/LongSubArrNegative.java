package Arrays.easy;

import java.util.HashMap;

public class LongSubArrNegative {
    public int findSubArr(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        map.put(0,-1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                maxLen = Math.max(maxLen,i - map.get(sum - k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;

        LongSubArrNegative solver = new LongSubArrNegative();
        int len = solver.findSubArr(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

// Sliding window does not work in negetive numbers, so we use prefix-sum
//Instead of checking all subarrays, we track running total (prefix sum)
//If the difference between two prefix sums is k, then the subarray between them has sum k
//We use a HashMap to remember where each prefix sum was first seen
//First occurrence gives the longest possible subarray