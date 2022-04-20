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
class BSTIterator {
    Deque<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st=new ArrayDeque<>();
        addLeft(root);
    }
    public void addLeft(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
    public int next() {
        TreeNode top=st.pop();
        addLeft(top.right);
        return top.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */