//TC: O(N)
//SC: O(N) -> worst case [skew tree]
//https://www.youtube.com/watch?v=Op6YFcs8R9M

public class MaxPathSumOfBTBrute {
    static int maxi;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root));
    }

    public static int maxPathSum(TreeNode root) {
        maxi = Integer.MIN_VALUE;
        solve(root);
        return maxi;
    }

    public static int solve(TreeNode root){
        if(root == null) return 0;

        //explore left and right first, unke values chahiye
        int left = solve(root.left);
        int right = solve(root.right);

        int nicheMilGayaAns = left + right + root.val;//umbrella path already bann gaya hai niche hi
        int koiEkAchha = Math.max(left,right) + root.val;//possibility hai path banne ki
        int onlyRootAchha = root.val;//starting point hai path ka

        maxi = Math.max(maxi, Math.max(nicheMilGayaAns, Math.max(koiEkAchha, onlyRootAchha)));

        //nicheMilGayaAns nahi bhej sakte kyunki path already found
        return Math.max(koiEkAchha, onlyRootAchha);
    }

}
