package leetcode.slidingwindow;

import java.util.*;

public class LongestSubstringWithoutRepCharacters {

    public int lengthOfLongestSubstring(String s) {

        int maxWindow = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow;
    }


    public static void main(String[] args) {
        LongestSubstringWithoutRepCharacters sol = new LongestSubstringWithoutRepCharacters();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: " + s1);
        System.out.println("Longest Length: " + sol.lengthOfLongestSubstring(s1));

        System.out.println("\nInput: " + s2);
        System.out.println("Longest Length: " + sol.lengthOfLongestSubstring(s2));

        System.out.println("\nInput: " + s3);
        System.out.println("Longest Length: " + sol.lengthOfLongestSubstring(s3));
    }
}

