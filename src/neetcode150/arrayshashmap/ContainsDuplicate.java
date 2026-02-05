package neetcode150.arrayshashmap;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        striverleetcode.Arrays.easy.ContainsDupli obj = new striverleetcode.Arrays.easy.ContainsDupli();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(obj.containsDuplicate(nums1));
        System.out.println(obj.containsDuplicate(nums2));
    }
}

