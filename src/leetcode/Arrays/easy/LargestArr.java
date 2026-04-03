package leetcode.Arrays.easy;

public class LargestArr {
    public int largestNum(int[] nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int largest = Integer.MIN_VALUE;
        for(int num:nums){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        LargestArr arr = new LargestArr();
        int[] arrNum = new int[]{4,10,3,5,1,9,34};
        System.out.println(arr.largestNum(arrNum));
    }
}
