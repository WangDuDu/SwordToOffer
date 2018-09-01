/**
 * Created by wangshuyang on 2018-8-31.
 * 二叉搜索树的后序遍历
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return check(sequence, 0, sequence.length - 1);
    }
    public boolean check(int[] sequence, int start, int end) {
        int index = sequence[end];
        int i, j;
        for (i = start; i < end; i++) {
            if (sequence[i] > index) {
                break;
            }
        }
        for (j = i; j < end; j++) {
            if (sequence[j] < index) {
                return false;
            }
        }
        boolean left = true;
        boolean right = true;
        if (i > start) {
            left = check(sequence, start, i - 1);
        }
        if (j < end - 1) {
            right = check(sequence, j, end - 1);
        }
        return (left && right);
    }
}
