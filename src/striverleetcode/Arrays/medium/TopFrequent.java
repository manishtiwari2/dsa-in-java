package striverleetcode.Arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class TopFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxNum = 0;

            for (int num : map.keySet()) {
                int freq = map.get(num);
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxNum = num;
                }
            }
            result[i] = maxNum;
            map.remove(maxNum);
        }
        return result;
    }
    public static void main(String[] args) {
        TopFrequent obj = new TopFrequent();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] ans = obj.topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements:");
        for (int num : ans) {
            System.out.println(num);
        }
    }
}

// My current solution is brute force. It works by repeatedly scanning
// the frequency map to find the maximum. Its time complexity is O(n × k).
// To optimize, I would need a data structure that helps me keep track of the
// top k frequencies efficiently, like a heap or by grouping by frequency using buckets.