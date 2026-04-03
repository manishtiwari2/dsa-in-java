package leetcode.sorting;

public class BubbleSort {

    public void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] nums = {4, 3, 5, 7, 1};
        bs.sort(nums);
        System.out.println("Bubble Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
