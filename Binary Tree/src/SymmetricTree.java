// TC: O(n); SC: O(n) -> auxiliary space or stack space for a skew tree at the worst case.
//https://www.youtube.com/watch?v=lHLW1L8Qc5w
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.left.left = new TreeNode(3);

        System.out.println(isSymmetricTree(root));
    }

    public static boolean isSymmetricTree(TreeNode root){
        if(root == null) return true;

        return check(root.left, root.right);
    }

    public static boolean check(TreeNode l, TreeNode r){
        //structure same
        if(l == null && r == null) return true;

        if(l == null || r == null) return false;

        //value-wise same
        if((l.val == r.val) && check(l.left, r.right) && check(l.right, r.left)) return true;

        return  false;
    }

}
