import com.sun.source.tree.Tree;
//TC: O(N) -> iterating through n elements
//SC: O(N) -> At max Queue can have n elements. We do not consider ans as it is used to return the answer.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        node.right = new TreeNode(3);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);

        List<List<Integer>> ans = levelOrder(node);
        System.out.println(ans);
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        //agar root null hai, we return an empty list of lists
        if(root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //add root to the queue
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                subList.add(queue.poll().val);
            }
            ans.add(subList);
        }
        return ans;
    }
}
