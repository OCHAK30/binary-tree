// YT: https://www.youtube.com/watch?v=Yt50Jfbd8Po
// TC: O(n) for traversal * O(n) for maxDepth -> O(n^2)
// SC: O(n) -> auxiliary space or stack space for a skew tree at the worst case.

/**
 * A balanced binary tree, also referred to as a height-balanced binary tree,
 * is defined as a binary tree in which the height of the left and right subtree
 * of any node differ by not more than 1.
 */
public class CheckForBalancedBTBrute {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(9);

        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        root.right.right.right.right = new TreeNode(8);

        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root){
        if(root == null) return true;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        if(Math.abs(rh - lh) > 1) return false;

        boolean left = isBalanced(root.left);//explore left nodes
        boolean right = isBalanced(root.right);//explore right nodes

        if(!left || !right) return false;//any node gives you false then it is not balanced

        return true;
    }

    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }
}
