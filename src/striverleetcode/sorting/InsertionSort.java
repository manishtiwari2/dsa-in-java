package striverleetcode.sorting;

public class InsertionSort {
    public void sort(int[] nums){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i - 1;
            while ( j>= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] nums = {4, 3, 5, 7, 1};
        bs.sort(nums);
        System.out.println("Insertion Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
