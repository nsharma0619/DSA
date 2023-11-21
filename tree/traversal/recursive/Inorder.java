// https://leetcode.com/problems/binary-tree-inorder-traversal/
package tree.traversal.recursive;

import java.util.List;

public class Inorder {

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
    public List<Integer> inorderTraversal(TreeNode root, List<Integer> ls){
        if(root==null) return ls;
        if(root.left!=null) inorderTraversal(root.left, ls);
        ls.add(root.val);
        if(root.right!=null) inorderTraversal(root.right, ls);
        return ls;
    }
}
