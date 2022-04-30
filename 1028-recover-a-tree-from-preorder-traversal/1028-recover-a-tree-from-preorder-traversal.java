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
    public TreeNode recoverFromPreorder(String t) {
        Deque<TreeNode> st=new ArrayDeque<>();
        int i=0;
        while(i<t.length()){
            int d=0;
            while(i<t.length() && t.charAt(i)=='-'){
                d++;i++;
            }
            int val=0;
            while(i<t.length() && Character.isDigit(t.charAt(i))){
                val=val*10+t.charAt(i)-'0';i++;
            }
            TreeNode node=new TreeNode(val);
            if(st.isEmpty()){
                st.push(node);
            }
            else{
                while(st.size()>d) st.pop();
                if(st.peek().left!=null) st.peek().right=node;
                else st.peek().left=node;
                st.push(node);
            }
        }
        while(st.size()>1) st.pop();
        return st.peek();
    }
}