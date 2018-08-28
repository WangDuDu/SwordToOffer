import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by wangshuyang on 2018-8-28.
 */
public class MaxInWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> queue = new LinkedList<Integer>();
        if (size <= 0) {
            return list;
        }
        for (int i = 0; i < num.length; i++) {
            int begin = i - size + 1;
            if (queue.isEmpty()) {
                queue.add(i);
            } else if (begin > queue.peekFirst()) {
                queue.pollFirst();
            }

            while (!queue.isEmpty() && num[i] >= num[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.add(i);
            if (begin >= 0) {
                list.add(num[queue.peekFirst()]);

            }
        }
        return list;
    }
}
