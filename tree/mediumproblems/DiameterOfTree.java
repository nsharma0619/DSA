package tree.mediumproblems;

public class DiameterOfTree {
    
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

    class Diameter{
        int diameter;
    }
    public int height(TreeNode node, Diameter diameter){
        if(node==null) return 0;
        int leftHeight = height(node.left, diameter);
        int rightHeight = height(node.right, diameter);
        diameter.diameter = Math.max(leftHeight+rightHeight, diameter.diameter);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Diameter diameter = new Diameter();
        height(root, diameter);
        return diameter.diameter;
    }
}
