// https://leetcode.com/problems/binary-tree-preorder-traversal/

package tree.traversal.recursive;

import java.util.ArrayList;
import java.util.List;

public class Postorder {

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
    public List<Integer> preorderTraversal(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return arr;
        arr.add(root.val);
        if(root.left!=null) preorderTraversal(root.left, arr);
        if(root.right!=null) preorderTraversal(root.right, arr);
        return arr;
    }
}
