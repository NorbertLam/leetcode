/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        fmax(root);
        return max;
    }
    
    public int fmax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = fmax(root.left);
        int right = fmax(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
        
    }
}