//https://leetcode.com/problems/binary-tree-preorder-traversal/description/

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(6);

        node.right = new TreeNode(3);
        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(8);
        node.right.right.left = new TreeNode(9);
        node.right.right.right = new TreeNode(10);

        preorder(node);
    }

    public static void preorder(TreeNode node){
        //{ROOT LEFT RIGHT}
        if(node == null){
            return;
        }

        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }
}
