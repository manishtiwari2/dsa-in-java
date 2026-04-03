package leetcode.arrayshashmap;
import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int firstNum = 0; firstNum < nums.length; firstNum++) {
            int secondNum = target - nums[firstNum];
            if (!map.containsKey(secondNum)) {
                map.put(nums[firstNum], firstNum);
            } else {
                return new int[]{map.get(secondNum), firstNum};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indexes: " + Arrays.toString(result));
    }
}
