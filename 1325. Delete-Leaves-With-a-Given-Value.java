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
// https://leetcode.com/submissions/detail/1260708224/
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null) {
            return null;
        }
        
        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);
        
        // System.out.println("ROOT: "+root.val);
        if(root.left == null && root.right == null && root.val == target) {
            return null;
        }

        
        return root;
        
        
        
    }
}
