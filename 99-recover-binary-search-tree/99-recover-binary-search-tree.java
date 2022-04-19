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
    List<Integer> al=new ArrayList<>();
    int i=0;
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        al.add(root.val);
        dfs(root.right);
    }
    public void dfs1(TreeNode root){
        if(root==null) return;
        dfs1(root.left);
        root.val=al.get(i);
        i++;
        dfs1(root.right);
    }
    public void recoverTree(TreeNode root) {
        dfs(root);
        Collections.sort(al);
        System.out.println(al);
        dfs1(root);
    }
}