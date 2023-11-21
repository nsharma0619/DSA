package tree.traversal.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Preorder {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<>();
        while(curr!=null || st.size()>0){
            while(curr!=null){
                arr.add(curr.val);
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            curr = curr.right;
        }
        return arr;
    }
}
