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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {

            // Case 1: No left child
            if (curr.left == null) {
                ans.add(curr.val);
                curr = curr.right;
            } 
            // Case 2: Left child exists
            else {

                // Find inorder predecessor (rightmost node of left subtree)
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // First time visiting curr
                if (pred.right == null) {
                    pred.right = curr;   // Create thread
                    curr = curr.left;
                } 
                // Second time visiting curr
                else {
                    pred.right = null;   // Remove thread
                    ans.add(curr.val);   // Visit node
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}