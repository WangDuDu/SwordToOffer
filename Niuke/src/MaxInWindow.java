import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 滑动窗口的最大值
 *
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 *
 * 1.创建一个队列来作为窗口
 * 2.用begin来记录每次窗口滑动窗口的开始位置的下标
 * 3.如果当前的队列为空的话就将要进入的数字的下标入队
 * 4.队列头部的这个下标和begin比，判断头部的这个下标是否还应该在窗口中，不应该的话让其从队列头部出队
 * 5.队列不为空的情况下，从后往前判断队列队列中的下标所对应的数字是否比要入队的这个数字小，是的话将这个下标从队列尾部出队
 * 6.将当前遍历到的数字的下标入队
 * 7.这时候队头元素就是当前滑动窗口的最大值
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
