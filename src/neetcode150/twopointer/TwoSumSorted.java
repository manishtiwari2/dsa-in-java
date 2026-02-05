package neetcode150.twopointer;

import java.util.*;

public class TwoSumSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSumSorted obj = new TwoSumSorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(numbers, target);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        System.out.println("Answer Indexes: " + Arrays.toString(result));
    }
}

