import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by wangshuyang on 2018/4/9.
 *
 * 解决该问题使用一个大顶堆
 * 1.遍历这个数组，当堆中的数据小于k个的时候直接加入大顶堆当中
 * 2.当等于k个的时候，比较大顶堆的堆顶与当前遍历到的数组，如果堆顶的元素比当前遍历到的数大，那么就弹出当前堆顶，将遍历到的数加入堆
 * 3.最后遍历完这个堆中就是最小的k个数
 * 注：Java中的堆使用PriorityQueue来实现
 */
public class MinKOfNum {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (input.length == 0 || k <= 0 || k > input.length) {
            return list;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.offer(input[i]);
            } else {
                if (maxHeap.peek() > input[i]) {
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }

        for (Integer i:maxHeap) {
            list.add(i);
        }


        return list;
    }
}
