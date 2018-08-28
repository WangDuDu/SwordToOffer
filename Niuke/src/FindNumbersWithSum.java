import java.util.ArrayList;

/**
 * Created by wangshuyang on 2018/5/4.
 * 和为S的两个数字
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 *
 数列满足递增，设两个头尾两个指针i和j，
 若ai + aj == sum，就是答案（相差越远乘积越小）
 若ai + aj > sum，aj肯定不是答案之一（前面已得出 i 前面的数已是不可能），j -= 1
 若ai + aj < sum，ai肯定不是答案之一（前面已得出 j 后面的数已是不可能），i += 1
 O(n)
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum_Solution(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            if ((array[low] + array[high]) == sum) {
                list.add(array[low]);
                list.add(array[high]);
                return list;
            } else if ((array[low] + array[high]) > sum) {
                high--;
            } else {
                low++;
            }
        }

        return list;
    }
}
