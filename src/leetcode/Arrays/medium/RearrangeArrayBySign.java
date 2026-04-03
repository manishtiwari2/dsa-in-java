package leetcode.Arrays.medium;
import java.util.Arrays;

public class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIdx = 0;
        int negIdx = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[posIdx] = nums[i];
                posIdx = posIdx + 2;
            }
            else{
                ans[negIdx] = nums[i];
                negIdx = negIdx + 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        RearrangeArrayBySign obj = new RearrangeArrayBySign();
        int[] nums = {3, -2, -1, 5, 4, -6};
        int[] ans = obj.rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}

//public int[] rearrangeArray(int[] nums) {
//    int n = nums.length;
//    int[] posArr = new int[n / 2];
//    int[] negArr = new int[n / 2];
//    int pos = 0;
//    int neg = 0;
//
//    for (int num : nums) {
//        if (num > 0) {
//            posArr[pos++] = num;
//        } else {
//            negArr[neg++] = num;
//        }
//    }
//    pos = 0;
//    neg = 0;
//    for (int i = 0; i < n; i += 2) {
//        nums[i] = posArr[pos++];
//    }
//    for (int i = 1; i < n; i += 2) {
//        nums[i] = negArr[neg++];
//    }
//    return nums;
//}