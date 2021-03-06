import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangshuyang on 2018-8-25.
 */
public class PrintMinNumber {
    public String printMinNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });

        for (Integer i : list) {
            sb.append(i);
        }

        return sb.toString();
    }
}
