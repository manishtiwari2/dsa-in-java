package leetcode.arrayshashmap;

import java.util.*;

public class EncodeDecodeStrings {
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int l = s.length();
            sb.append(l);
            sb.append('*');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '*') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;
            j = i + length;

            ls.add(str.substring(i, j));
            i = j;
        }
        return ls;
    }

    public static void main(String[] args) {
        EncodeDecodeStrings sol = new EncodeDecodeStrings();
        List<String> input = Arrays.asList("hello", "world", "java", "123*abc");

        String encoded = sol.encode(input);
        System.out.println("Encoded String: " + encoded);

        List<String> decoded = sol.decode(encoded);
        System.out.println("Decoded List: " + decoded);
    }
}
