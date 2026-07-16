class Solution {

    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (rabinKarp(sb.toString(), b)) {
            return count;
        }

        sb.append(a);

        if (rabinKarp(sb.toString(), b)) {
            return count + 1;
        }

        return -1;
    }

    private boolean rabinKarp(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        if (m > n) {
            return false;
        }

        int base = 31;
        int mod = 1000000007;

        long patternHash = 0;
        long textHash = 0;
        long power = 1;

        for (int i = 0; i < m - 1; i++) {
            power = (power * base) % mod;
        }
        for (int i = 0; i < m; i++) {
            patternHash = (patternHash * base + pattern.charAt(i)) % mod;
            textHash = (textHash * base + text.charAt(i)) % mod;
        }
        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash) {

                int j = 0;
                while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                    j++;
                }
                if (j == m) {
                    return true;
                }
            }
            if (i < n - m) {
                textHash = (textHash - text.charAt(i) * power % mod + mod) % mod;
                textHash = (textHash * base + text.charAt(i + m)) % mod;
            }
        }
        return false;
    }
}