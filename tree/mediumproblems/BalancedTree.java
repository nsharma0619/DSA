// https://leetcode.com/problems/balanced-binary-tree/
package tree.mediumproblems;

public class BalancedTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int heightModified(TreeNode root){
        if(root==null) return 0;
        int leftHeight = heightModified(root.left);
        int rightHeight = heightModified(root.right);
        if(leftHeight==-1 || rightHeight==-1 || Math.abs(leftHeight-rightHeight)>1) return -1;
        return 1+Math.max(leftHeight, rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
        return heightModified(root)!=-1;
    }
}
