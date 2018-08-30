/**
 * Created by wangshuyang on 2018-8-30.
 *
 * 求二叉树节点之间的最远距离
 *
 * 求出二叉树中每个节点到左右子树叶节点的最远距离之和，最大的就是二叉树中节点之间的最远距离
 */
public class FastDitenceInBinaryTree {
    static int maxDistence = 0;
    public void getMaxLength(Node node) {
        if (node == null) {
            return;
        }

        if (node.left == null) {
            node.maxLeft = 0;
        }
        if (node.right == null) {
            node.maxRight = 0;
        }
        if (node.left != null) {
            getMaxLength(node.left);
        }
        if (node.right != null) {
            getMaxLength(node.right);
        }
        if (node.left != null) {
            node.maxLeft = node.left.maxLeft > node.left.maxRight ? node.left.maxLeft + 1 : node.left.maxRight + 1;
        }
        if (node.right != null) {
            node.maxRight = node.right.maxLeft > node.right.maxRight ? node.right.maxLeft + 1 : node.right.maxRight + 1;
        }
        if ((node.maxLeft + node.maxRight) > maxDistence) {
            maxDistence = node.maxLeft + node.maxRight;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(0);
        Node p1=new Node(1);
        Node p2=new Node(2);
        Node p3=new Node(3);
        Node p4=new Node(4);
        Node p5=new Node(5);
        Node p6=new Node(6);
        Node p7=new Node(7);
        Node p8=new Node(8);
        root.left=p1;
        root.right=p2;
        p1.left=p3;
        p3.left=p4;
        p2.left=p5;
        p2.right=p6;
        p6.right=p7;
        p7.right=p8;
        System.out.println(maxDistence);
        new FastDitenceInBinaryTree().getMaxLength(root);
        System.out.println(maxDistence);

    }
}
class Node {
    int data;
    int maxLeft;
    int maxRight;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
