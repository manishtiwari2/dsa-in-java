package striverleetcode.Arrays.medium;
import java.util.Arrays;


public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] preArr = new int[n];
        int[] suffArr = new int[n];
        for(int i = 0; i < n; i++){
            preArr[i] = 1;
            suffArr[i] = 1;
        }
        for(int j = 1; j < n; j++){
            preArr[j] = preArr[j-1]*nums[j-1];
        }
        for(int j = n-2; j >=0; j--){
            suffArr[j] = suffArr[j+1]*nums[j+1];
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = preArr[i]*suffArr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        ProductExceptSelf obj = new ProductExceptSelf();

        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}




