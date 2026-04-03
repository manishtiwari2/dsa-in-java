package leetcode.Arrays.easy;

public class MissingNumber {
    public int findMissing(int[] nums) {
        int xorOfArray = 0;
        int xorOfRange = 0;
        int n = nums.length;
        // XOR all elements in the array and all indices
        for (int i = 0; i < n; i++) {
            xorOfArray ^= nums[i];
            xorOfRange ^= i;
        }
        // include the last number in range [0..n]
        xorOfRange ^= n;
        return xorOfArray ^ xorOfRange;
    }
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] arrNum = {0,1, 3, 4, 5};
        System.out.println(mn.findMissing(arrNum)); // 0
    }
}


//Approach -01

//public int missingNumber(int[] nums) {
//    int n = nums.length;
//    boolean[] present = new boolean[n + 1];
//
//    for (int i = 0; i < n; i++) {
//        present[nums[i]] = true;
//    }
//
//    for (int i = 0; i <= n; i++) {
//        if (!present[i]) {
//            return i;
//        }
//    }
//
//    return -1;
//}


//Approach - 02

//public int findMissing(int[] nums) {
//    int n = nums.length;
//    long arrSum = 0;
//    long actualSum = (long) n * (n + 1) / 2;
//
//    for (int i = 0; i < n; i++) {
//        arrSum += nums[i];
//    }
//
//    return (int) (actualSum - arrSum);
//}
