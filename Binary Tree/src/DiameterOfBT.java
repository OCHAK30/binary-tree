//TC: O(N)
//SC: O(N) -> worst case [skew tree]
public class DiameterOfBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);

        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        maxDepth(root, diameter);
        return diameter[0];
    }

    public static int maxDepth(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int lh = maxDepth(root.left, diameter);
        int rh = maxDepth(root.right, diameter);

        diameter[0] = Math.max(diameter[0], lh+rh);

        return 1 + Math.max(lh, rh);
    }
}
