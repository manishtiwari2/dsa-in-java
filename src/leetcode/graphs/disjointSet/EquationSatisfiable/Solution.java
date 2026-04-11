package leetcode.graphs.disjointSet.EquationSatisfiable;

class Solution {

    private int[] parent;
    private int[] rank;

    public boolean equationsPossible(String[] equations) {

        initializeDisjointSet();

        // Step 1: Merge all equal variables
        for (String equation : equations) {
            if (isEquality(equation)) {
                int firstVar = getVariableIndex(equation.charAt(0));
                int secondVar = getVariableIndex(equation.charAt(3));

                mergeSets(firstVar, secondVar);
            }
        }

        // Step 2: Validate inequality constraints
        for (String equation : equations) {
            if (isInequality(equation)) {
                int firstVar = getVariableIndex(equation.charAt(0));
                int secondVar = getVariableIndex(equation.charAt(3));

                boolean sameGroup = findParent(firstVar) == findParent(secondVar);

                if (sameGroup) {
                    return false;
                }
            }
        }

        return true;
    }

    private void initializeDisjointSet() {
        parent = new int[26];
        rank = new int[26];

        for (int i = 0; i < 26; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    private boolean isEquality(String equation) {
        return equation.charAt(1) == '=';
    }

    private boolean isInequality(String equation) {
        return equation.charAt(1) == '!';
    }

    private int getVariableIndex(char variable) {
        return variable - 'a';
    }

    private int findParent(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }

    private void mergeSets(int nodeA, int nodeB) {
        int rootA = findParent(nodeA);
        int rootB = findParent(nodeB);

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
