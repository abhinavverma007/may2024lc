// https://leetcode.com/submissions/detail/1260678143/
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
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null){
            if(root.val == 0) {
                return false;
            }
            return true;
        }
        
        boolean leftSubTreeVal = evaluateTree(root.left);
        boolean rightSubTreeVal = evaluateTree(root.right);

        
        if(root.val == 3) {
            boolean res = leftSubTreeVal && rightSubTreeVal;
            if(res) {
                root.val = 1;
            }
            else{
                root.val = 0;
            }
            return res;
        }
        
                        boolean res = leftSubTreeVal || rightSubTreeVal;
            if(res) {
                root.val = 1;
            }
            else{
                root.val = 0;
            }
        return res;
        

        
    }
}
