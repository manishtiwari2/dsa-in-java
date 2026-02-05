package Arrays.easy;

import java.util.HashSet;

public class ContainsDupli {
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
        ContainsDupli obj = new ContainsDupli();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(obj.containsDuplicate(nums1));
        System.out.println(obj.containsDuplicate(nums2));
    }
}

