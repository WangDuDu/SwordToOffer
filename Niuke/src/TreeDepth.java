/**
 * Created by wangshuyang on 2018/4/17.
 * 二叉树的深度
 *
 * 1.使用动态规划
 * 2.分别求得左右子树的深度，然后选深的那个加一即可
 */
public class TreeDepth {
    public int treeDepth_Solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int right = treeDepth_Solution(root.right);
        int left = treeDepth_Solution(root.left);
        return left < right ? right + 1 : left + 1;
    }
}
