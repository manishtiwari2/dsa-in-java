/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    int idx;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;
        return build(postorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] post, int[] in, int start, int end) {

        if (start > end) {
            return null;
        }
        int rootVal = post[idx--];
        TreeNode root = new TreeNode(rootVal);

        int i = start;
        while (in[i] != rootVal) {
            i++;
        }

        root.right = build(post, in, i + 1, end);
        root.left = build(post, in, start, i - 1);
        return root;
    }
}