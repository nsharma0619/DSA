package tree.traversal.iterative;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Levelorder {
    
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ansList = new ArrayList<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> list = new ArrayList<>();
            while(qSize-- > 0){
                TreeNode tmp = q.remove();
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
                list.add(tmp.val);
            }
            ansList.add(list);
        }
        return ansList;
    }
}
