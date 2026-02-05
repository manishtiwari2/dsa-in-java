package Strings.medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            String curr = strs.get(i);
            int length = curr.length();
            sb.append(length);
            sb.append('*');
            sb.append(curr);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int len = 0;
            while (str.charAt(i) != '*') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            StringBuilder sb = new StringBuilder();
            while (len > 0) {
                sb.append(str.charAt(i));
                i++;
                len--;
            }
            arr.add(sb.toString());
        }
        return arr;
    }

    public static void main(String[] args) {
        EncodeDecode codec = new EncodeDecode();

        List<String> input = new ArrayList<>();
        input.add("hello");
        input.add("world");
        input.add("123*abc");
        input.add("");

        System.out.println("Original List:");
        System.out.println(input);

        String encoded = codec.encode(input);
        System.out.println("\nEncoded String:");
        System.out.println(encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println("\nDecoded List:");
        System.out.println(decoded);
    }
}
