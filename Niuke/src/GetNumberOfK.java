/**
 * Created by wangshuyang on 2018/4/16.
 * 数字在排序数组中出现的次数
 *
 * 使用二分查找的方法，先找到第一次出现的位置，再找到最后一次出现的位置就可以了
 */
public class GetNumberOfK {
    public int getNumberOfK_Solution(int [] array , int k) {
        if (array.length == 0)
            return 0;
        int low = 0;
        int high = array.length-1;
        int left = 0, right = 0;
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (array[middle] > k) {
                high = middle-1;
            } else if (array[middle] < k) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }

        if (array[low] == k) {
            left = low;
        } else
            return 0;

        low = 0;
        high = array.length-1;
        while (low < high) {
            // 这里如果使用int middle = low + (high - low) / 2;就会报超时的问题
            int middle = low + (high - low + 1) / 2;
            if (array[middle] > k) {
                high = middle - 1;
            } else if (array[middle] < k) {
                low = middle + 1;
            } else {
                low = middle;
            }
        }

        if (array[high] == k) {
            right = high;
        }

        return right - left + 1;


    }
}
