// YT: https://www.youtube.com/watch?v=Yt50Jfbd8Po
// TC: O(n); SC: O(n) -> auxiliary space or stack space for a skew tree at the worst case.
public class CheckForBalancedBT {
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
        return (maxDepth(root) != -1);
    }

    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        if(lh == -1) return -1;

        int rh = maxDepth(root.right);
        if(rh == -1) return  -1;

        if(Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
    }
}
