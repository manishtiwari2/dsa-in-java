package leetcode.basics.maths;

public class CheckPalindrome {

    public boolean checkPalin(int num) {

        // explicit negative handling
        if (num < 0) {
            return false;
        }

        int original = num;
        int rev = 0;

        while (num > 0) {
            int last = num % 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10) {
                return false;
            }

            rev = rev * 10 + last;
            num /= 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        CheckPalindrome palin = new CheckPalindrome();
        System.out.println(palin.checkPalin(121));   // true
        System.out.println(palin.checkPalin(-121));  // false
        System.out.println(palin.checkPalin(123));   // false
    }
}
