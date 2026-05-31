public class PostOrderTraversal {
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

        postorder(node);
    }

    public static void postorder(TreeNode node){
        //{LEFT RIGHT ROOT}
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }
}
