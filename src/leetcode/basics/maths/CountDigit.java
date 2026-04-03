package leetcode.basics.maths;

public class CountDigit {

    public int countDigits(int n) {
        if (n == 0) return 1;

        n = Math.abs(n);
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigit digit = new CountDigit();
        System.out.println(digit.countDigits(-7672)); // 4
    }
}
