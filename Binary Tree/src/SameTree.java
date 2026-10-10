// YT: https://www.youtube.com/watch?v=YtoibyDlzk0
// TC: O(n); SC: O(n) -> auxiliary space or stack space for a skew tree at the worst case.
public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.left.left = new TreeNode(3);

        System.out.println(isSameTree(p,q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        //structure-wise same
        if(p == null && q == null) return true;

        //if any one is null, other is not then not the same trees
        if(p == null || q == null) return false;

        //value-wise same? if not return false
        if(p.val != q.val) return false;

        //value-wise same then explore left or right of both the trees simultaneously
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
