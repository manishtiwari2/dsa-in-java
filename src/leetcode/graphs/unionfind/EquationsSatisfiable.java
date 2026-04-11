package leetcode.graphs.unionfind;
/*
Problem: Satisfiability of Equality Equations

Input:
equations = ["a==b","b!=c"]

Output:
true/false

Approach:
1. Use DSU
2. First process ==
3. Then check !=

Time Complexity: O(n)
Space Complexity: O(1)
*/


public class EquationsSatisfiable {

    private int[] parent;
    private int[] rank;

    public boolean equationsPossible(String[] equations) {
        initializeDSU();

        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                union(eq.charAt(0) - 'a', eq.charAt(3) - 'a');
            }
        }

        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                if (find(eq.charAt(0) - 'a') == find(eq.charAt(3) - 'a')) {
                    return false;
                }
            }
        }

        return true;
    }

    private void initializeDSU() {
        parent = new int[26];
        rank = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
    }

    private int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) return;

        if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else {
            parent[rootA] = rootB;
            rank[rootB]++;
        }
    }
}