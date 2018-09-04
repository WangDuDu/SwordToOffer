/**
 * Created by wangshuyang on 2018-9-3.
 * 调整数组的顺序使奇数位于偶数的前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int[] array) {
        int i = 0, j;
        int length = array.length;
        while (i < length) {
            while (i < length && (array[i] & 1) == 1) {
                i++;
            }
            j = i + 1;
            while (j < length && (array[j] & 1) == 0) {
                j++;
            }
            if (j < length) {
                int temp = array[j];
                for (int k = j; k > i; k--) {
                    array[k] = array[k - 1];
                }
                array[i] = temp;
            } else {
                break;
            }
        }
    }
}
