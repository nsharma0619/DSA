// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

package tree.mediumproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ZigZag
 */
public class ZigZag {

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        boolean isLeftToRight = false;
        while(!q.isEmpty()){
            List<Integer> ansSubList = new ArrayList<>();
            int qSize = q.size();
            while(qSize-->0){
                TreeNode node = q.remove();
                ansSubList.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(isLeftToRight) Collections.reverse(ansSubList);
            ansList.add(ansSubList);
            isLeftToRight = !isLeftToRight;
        }
        return ansList;
    }
}