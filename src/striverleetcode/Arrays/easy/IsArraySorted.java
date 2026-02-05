package striverleetcode.Arrays.easy;


public class IsArraySorted {
    public boolean isSorted(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }

        if (nums[0] < nums[nums.length - 1]) {
            count++;
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        IsArraySorted arr = new IsArraySorted();
        int[] nums = new int[]{69,68,7,8,67};
        boolean ans = arr.isSorted(nums);
        System.out.println(ans);
    }
}
