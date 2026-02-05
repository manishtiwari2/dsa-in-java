package striverleetcode.Arrays.easy;

public class SecondLargest {
    public int secondNum(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Need at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                second = largest;
                largest = num;
            }
            else if (num < largest && num > second) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No distinct second largest element");
        }

        return second;
    }

    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int[] arr = new int[]{5, 7, 2, 9, 12, 23, 0};
        System.out.println(sl.secondNum(arr)); // 12
    }
}
