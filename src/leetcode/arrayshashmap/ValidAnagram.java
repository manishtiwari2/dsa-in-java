package leetcode.arrayshashmap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            arr[ch - 'a']--;
        }
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        ValidAnagram sol = new ValidAnagram();
        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println("Test 1: " + sol.isAnagram(s1, t1));
        System.out.println("Test 2: " + sol.isAnagram(s2, t2));
    }
}

