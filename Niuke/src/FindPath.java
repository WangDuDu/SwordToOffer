import java.util.ArrayList;

/**
 * Created by wangshuyang on 2018-8-31.
 *
 * 二叉树中和为某一数的路径
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> pathList = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return result;
        }
        target -= root.val;
        pathList.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(pathList));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        pathList.remove(pathList.size() - 1);
        return result;
    }
}
