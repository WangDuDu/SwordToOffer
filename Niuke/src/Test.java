import java.util.*;

/**
 * Created by wangshuyang on 2018-8-1.
 */
public class Test {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (i < k) {
                maxHeap.offer(input[i]);
            } else {
                if (maxHeap.peek() > input[i]) {
                    maxHeap.poll();
                    maxHeap.offer(input[i]);
                }
            }
        }

        for (Integer integer : maxHeap) {
            list.add(integer);
        }

        return list;

    }

}
