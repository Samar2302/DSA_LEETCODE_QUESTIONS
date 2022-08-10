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
    TreeNode helper(int[] arr,int l,int r){
        if(l>r) return null;
        if(l==r) return new TreeNode(arr[l]);
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=helper(arr,l,mid-1);
        root.right=helper(arr,mid+1,r);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
}