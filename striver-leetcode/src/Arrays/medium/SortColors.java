package Arrays.medium;

import java.util.Arrays;
// Dutch National Flag Algorithm
public class SortColors {

    public void sort(int[] nums) {
        int first = 0;
        int middle = 0;
        int second = nums.length - 1;

        while (middle <= second) {
            if (nums[middle] == 0) {
                swap(nums, first, middle);
                first++;
                middle++;
            }
            else if (nums[middle] == 1) {
                middle++;
            }
            else {
                swap(nums, middle, second);
                second--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};

        sc.sort(nums);

        System.out.println(Arrays.toString(nums));
    }

}
