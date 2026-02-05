package striverleetcode.Arrays.easy;

public class RemoveDupliSorted {
    public int removeDupli(int[] nums){
        int first = 0;
        int second = 1;
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        while (second < n){
            if(nums[first] == nums[second]){
                second++;
            } else {
                first++;
                nums[first] = nums[second];
                second++;
            }
        }

        return first + 1;
    }
    public static void main(String[] args){
        RemoveDupliSorted rd = new RemoveDupliSorted();
        int[] nums = new int[]{0,0,1,1,2,3,3,4};
        System.out.println(rd.removeDupli(nums));
    }
}
