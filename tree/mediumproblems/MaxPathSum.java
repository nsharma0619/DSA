// https://leetcode.com/problems/binary-tree-maximum-path-sum/
package tree.mediumproblems;

/**
 * MaxPathSum
 */
public class MaxPathSum {
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
    class MaxSum{
        int maxSum;
        public MaxSum(){
            maxSum = 0;
        }
        public MaxSum(int i){
            maxSum = i;
        }
    }
    int maxPathSum(TreeNode root, MaxSum maxSum){
        if(root==null) return 0;
        int maxLeftSum = maxPathSum(root.left, maxSum);
        int maxRightSum = maxPathSum(root.right, maxSum);
        int maxPossible = Math.max(maxLeftSum+maxRightSum+root.val, Math.max(Math.max(maxLeftSum+root.val, maxRightSum+root.val), root.val));
        maxSum.maxSum = Math.max(maxSum.maxSum, maxPossible);
        return Math.max(Math.max(maxLeftSum+root.val, maxRightSum+root.val), 0);
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        MaxSum maxSum = new MaxSum(root.val);
        maxPathSum(root, maxSum);
        return maxSum.maxSum;
    }
}