package tree.traversal.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };

public class AllTraversal {
    public static class Pair{
        int val;
        TreeNode node;
        public Pair(int val, TreeNode node){
            this.val = val;
            this.node = node;
        }
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        Stack<Pair> st = new Stack<>();
        if(root!=null){
            Pair pair = new Pair(1, root);
            st.add(pair);
        }
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        while(!st.isEmpty()){
            Pair tmpPair = st.pop();

            if(tmpPair.val==1){
                pre.add(tmpPair.node.data);
                tmpPair.val++;
                st.push(tmpPair);
                if(tmpPair.node.left!=null){
                    Pair pair = new Pair(1, tmpPair.node.left);
                    st.push(pair);
                }
            }else if(tmpPair.val==2){
                in.add(tmpPair.node.data);
                tmpPair.val++;
                st.push(tmpPair);
                if(tmpPair.node.right!=null){
                    Pair pair = new Pair(1, tmpPair.node.right);
                    st.push(pair);
                }
            }else{
                post.add(tmpPair.node.data);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(in);
        ans.add(pre);
        ans.add(post);
        return ans;
    }
}
