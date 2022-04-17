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
    TreeNode ans=new TreeNode(0);
    TreeNode ptr=ans;
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        TreeNode t=new TreeNode(root.val);
        ptr.right=t;
        ptr=ptr.right;
        dfs(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return ans.right;
    }
}