import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by wangshuyang on 2018/4/10.
 * 把数组排成最小数
 *
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * 1.将这些数字全部加入到一个List当中去
 * 2.对这个list建立排序的规则，，这个list当中的任意两个数组合起来，谁排前面的时候比较小，谁就排在更前面
 * 3.将这个list里面的所有数字拼起来
 */
public class MinNumOfArray {

    public String printMinNum (int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String string = "";
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
            string += i;
        }
        return string;
    }
}
