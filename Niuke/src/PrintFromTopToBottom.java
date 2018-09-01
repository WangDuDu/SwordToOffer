import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by wangshuyang on 2018-9-1.
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> solution(TreeNode root) {

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            list.add(node.val);
        }
        return list;
    }
}
