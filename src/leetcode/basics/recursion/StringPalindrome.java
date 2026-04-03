package leetcode.basics.recursion;

public class StringPalindrome {

    public boolean isPalin(String s, int left, int right) {

        if (left >= right) {
            return true;
        }
        // Compare characters at both ends
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalin(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        StringPalindrome sp = new StringPalindrome();

        String s1 = "madam";
        String s2 = "hello";

        System.out.println(sp.isPalin(s1, 0, s1.length() - 1));
        System.out.println(sp.isPalin(s2, 0, s2.length() - 1));
    }
}
