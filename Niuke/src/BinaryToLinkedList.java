/**
 * 二叉搜索书与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * 1.首先判断当前节点如果为null的话直接返回。如果是叶子结点的话返回它本身
 * 2.首相递归处理当前及诶单的左子树，并且获取到左子树的最左边的节点
 * 3.然后得到左子树最右边的节点，如果这个节点不为null，将这个节点与当前节点相连
 * 4.然后递归处理当前节点的右子树，得到右子树的最左边的节点，如果其不为空就将它与当前节点相连
 * 5.最后如果当前节点的左子树存在，那么就返回左子树的最左边的节点，否则的话返回这个节点本身
 * Created by wangshuyang on 2018-8-29.
 */
public class BinaryToLinkedList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode temp = left;
        while (temp != null && temp.right != null) {
            temp = temp.right;
        }
        if(temp != null) {
            pRootOfTree.left = temp;
            temp.right = pRootOfTree;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right != null) {
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left != null ? left : pRootOfTree;
    }
}
