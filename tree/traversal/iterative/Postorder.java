// https://leetcode.com/problems/binary-tree-postorder-traversal/

package tree.traversal.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while(curr!=null || !st.isEmpty()){
            if(curr!=null) {
                st.push(curr);
                curr = curr.left;
            }else{
                TreeNode tmp = st.peek();
                if(tmp.right==null){
                    tmp = st.peek();
                    st.pop();
                    ans.add(tmp.val);
                    while(!st.isEmpty() && tmp==st.peek().right){
                        tmp = st.peek();
                        st.pop();
                        ans.add(tmp.val);
                    }
                }else{
                    curr = tmp.right;
                }
            }
        }
        return ans;
    }
}
