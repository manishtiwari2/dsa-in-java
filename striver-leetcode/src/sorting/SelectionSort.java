package sorting;

public class SelectionSort {
    public void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] nums = {4, 3, 5, 7, 1};

        ss.sort(nums);
        System.out.println("Selection sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
