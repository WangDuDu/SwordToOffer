/**
 * Created by wangshuyang on 2018/4/17.
 * 判断一棵树是否是平衡二叉树
 *
 * 1.首先明确一棵树要是平衡二叉树，他的左右子树的高度差必须小于1，并且它的左右子树也必须是平衡二叉树。
 * 2.所以采用动态规划的方法，如果为空树直接返回true。
 * 3.然后看左右子树的高度差是否小于1，如果不是的话直接返回false。
 * 3.如果前两个条件都满足看他满不满足它的左右子树都是平衡二叉树即可。
 */
public class IsBalanced {
    public boolean isBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
            return false;

        return isBalanced_Solution(root.left) && isBalanced_Solution(root.right);
    }

    public int getHeight (TreeNode root) {
        if (root == null) {
            return  0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return left < right ? right + 1 : left + 1;
    }
}
