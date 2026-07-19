class Solution {
    public String smallestSubsequence(String s) {

        boolean[] visited = new boolean[26];
        Deque<Character> st = new ArrayDeque<>();
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : s.toCharArray()) {

            // Update current char frequency
            freq[ch - 'a']--;

            // Skip if already present in stack
            if (visited[ch - 'a']) {
                continue;
            }
            // Maintain lexicographically smallest order
            while (!st.isEmpty() &&
                   st.peek() > ch &&
                   freq[st.peek() - 'a'] > 0) {

                visited[st.pop() - 'a'] = false;
            }
            st.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}