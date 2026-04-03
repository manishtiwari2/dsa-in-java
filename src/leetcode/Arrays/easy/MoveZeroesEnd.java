package leetcode.Arrays.easy;
import java.util.Arrays;
public class MoveZeroesEnd {
    public int[] moveZeroes(int[] nums){
        int first = 0;
        int second = 0;
        while ( second < nums.length){
            if(nums[second] != 0){
                nums[first] = nums[second];
                first++;
                second++;
            }
            else{
                second++;
            }
        }
        for(int i = first; i < nums.length;i++){
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroesEnd sol = new MoveZeroesEnd();

        int[] nums1 = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
