//TC: O(N) * O(N) -> O(N^2)
//SC: O(N) -> worst case [skew tree]
public class DiameterOfBTBrute {
    static int maxi = 0;
    static int sum = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);

        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        maxi = Math.max(maxi, lh+rh);

        diameterOfBinaryTree(root.left);//explore left nodes
        diameterOfBinaryTree(root.right);//explore right nodes

        return maxi;
    }

    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }
}
