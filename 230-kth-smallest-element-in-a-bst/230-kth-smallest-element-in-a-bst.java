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
    int c=0,ans=-1;
    public void dfs(TreeNode root,int k){
        if(root==null) return;
        dfs(root.left,k);
        c++;
        if(c==k && ans==-1) ans=root.val;
        dfs(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }
}