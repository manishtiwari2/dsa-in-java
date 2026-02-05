package striverleetcode.Arrays.easy;

class MaxOnes {

    static int maxConsecutiveOnes(int[] arr) {
        int max = 0;
        int current = 0;
        for (int num : arr) {
            if (num == 1) {
                current++;
            } else {
                current = 0;
            }
            max = Math.max(current, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};

        int result = maxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
