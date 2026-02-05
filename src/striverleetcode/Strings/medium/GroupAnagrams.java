package striverleetcode.Strings.medium;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> ans = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];

            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num: count){
                sb.append(num).append("#");
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
    public static void main(String[] args) {
        GroupAnagrams obj = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = obj.groupAnagrams(strs);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

}
