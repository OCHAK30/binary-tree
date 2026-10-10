// TC: O(n); SC: O(n) -> auxiliary space or stack space for a skew tree at the worst case.
public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root){
        if(root == null) return root;

        //If the left of the current node is not equal to null but the right node is null (and vice versa)
        //or neither of them is null, then we use a temporary variable and swap them.
        if(root.left != null || root.right != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        //We continue the recursion for the left and right nodes.
        invertTree(root.left);
        invertTree(root.right);

        //Lastly, if both the left and right nodes of the current node are null
        //i.e. we reach a leaf node, then we return the current node for that recursion call.
        return root;
    }

}
