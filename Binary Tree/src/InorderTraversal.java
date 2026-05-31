public class InorderTraversal {
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

        inorder(node);
    }

    public static void inorder(TreeNode node){
        //{LEFT ROOT RIGHT}
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
}
