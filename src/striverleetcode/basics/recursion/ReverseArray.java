package striverleetcode.basics.recursion;
import java.util.Arrays;

public class ReverseArray {
    public void reverse(int[] nums, int left, int right) {
        // base condition
        if (left >= right) {
            return;
        }
        // Swap
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        // Recursive call
        reverse(nums, left + 1, right - 1);
    }
    public static void main(String[] args) {
        ReverseArray revArr = new ReverseArray();
        int[] arr = {5, 4, 3, 2};

        System.out.println("Before reverse:");
        System.out.println(Arrays.toString(arr));

        revArr.reverse(arr, 0, arr.length - 1);

        System.out.println("After reverse:");
        System.out.println(Arrays.toString(arr));
    }
}
