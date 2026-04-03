package leetcode.Two_Pointers.medium;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String str = cleanString(s);
        int first = 0;
        int second = str.length() - 1;
        while (first < second) {
            if (str.charAt(first) != str.charAt(second)) {
                return false;
            }
            first++;
            second--;
        }
        return true;
    }

    public String cleanString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ValidPalindrome sol = new ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        String s4 = "No 'x' in Nixon";

        System.out.println(sol.isPalindrome(s1));
        System.out.println(sol.isPalindrome(s2));
        System.out.println(sol.isPalindrome(s3));
        System.out.println(sol.isPalindrome(s4));
    }
}
