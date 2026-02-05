package Arrays.easy;
import java.util.Arrays;
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        obj.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}

// Brute force: shifting one element at a time upto k times.

//public void rotate(int[] nums, int k) {
//    int n = nums.length;
//    if (n == 0) return;
//    k = k % n;
//    for (int i = 0; i < k; i++) {
//        int temp = nums[n - 1];
//        for (int j = n - 1; j > 0; j--) {
//            nums[j] = nums[j - 1];
//        }
//        nums[0] = temp;
//    }
//}