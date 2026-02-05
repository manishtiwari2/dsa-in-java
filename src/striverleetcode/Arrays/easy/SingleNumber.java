package striverleetcode.Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int findNum(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();

        int[] nums = {4, 4, 1, 1, 2};

        int result = sn.findNum(nums);
        System.out.println("Single number is: " + result);
    }
}



// Brute force --> O(n2) ==> count occurence of each number
//public int findNum(int[] nums) {
//    for (int i = 0; i < nums.length; i++) {
//        if (count(nums, nums[i]) == 1) {
//            return nums[i];
//        }
//    }
//    return 0;
//}
//
//public int count(int[] nums, int target) {
//    int ans = 0;
//    for (int i = 0; i < nums.length; i++) {
//        if (nums[i] == target) {
//            ans++;
//        }
//    }
//    return ans;
//}



// better solution --> Using hashmap

//public int findNum(int[] nums) {
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int i = 0; i < nums.length; i++){
//        if(map.containsKey(nums[i])){
//            map.put(nums[i], map.get(nums[i]) + 1);
//        } else {
//            map.put(nums[i],1);
//        }
//    }
//    for(int key: map.keySet()){
//        if(map.get(key) == 1){
//            return key;
//        }
//    }
//    return -1;
//}