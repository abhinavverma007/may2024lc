// https://leetcode.com/submissions/detail/1261642856/

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
    int moves = 0;
    public int distributeCoins(TreeNode root) {
        helper(root);
        return moves;
        
    }
    
    public int helper(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        int leftAns = helper(root.left);
        int rightAns = helper(root.right);
        moves+=Math.abs(leftAns)+Math.abs(rightAns);
        return leftAns+rightAns+root.val - 1;
    }
}
