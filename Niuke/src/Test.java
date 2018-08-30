import java.util.*;

/**
 * Created by wangshuyang on 2018-8-1.
 */
public class Test {
    public int LastRemaining_Solution(int n, int m) {
        if (m <= 0 || n <= 0) {
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        int out = 0;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            out = (out + m - 1) % list.size();
            list.remove(out);
        }

        if (list.size() == 1) {
            return list.get(0);
        }
        return -1;
    }

}
