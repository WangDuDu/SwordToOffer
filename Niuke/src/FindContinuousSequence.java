import java.util.ArrayList;

/**
 * Created by wangshuyang on 2018/4/26.
 * 和为S的连续正数序列
 *
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 * 首先sum<3的时候是没有满足的
 * 第一步，将small初值设为1，big初值设为2，将curSum的初值设为3
 * 第二步，如果当前的和已经大于要求的和那么就减去small，然后更新small的值
 * 第三步，如果在第二步之后curSum=sum那么就求得了一个答案
 * 第四步，最后将更新big的值，将新的big加上。
 * 直到small的值等于middle或者big的值等于sum就终止。
 * 最后输出全部的结果即可。
 */
public class FindContinuousSequence {

    public ArrayList<ArrayList<Integer>> findContinuousSequence_Solution (int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int small = 1;
        int big = 2;
        int middle = (sum + 1) / 2;
        int curSum = small + big;

        while (small < middle && big < sum) {
            if (curSum == sum) {
                ArrayList<Integer> listInteger = new ArrayList<Integer>();
                for (int i = small; i <= big; i++) {
                    listInteger.add(i);
                }
                list.add(listInteger);
            }

            while (curSum > sum) {
                curSum -= small;
                small++;
                if (curSum == sum) {
                    ArrayList<Integer> listInteger = new ArrayList<Integer>();
                    for (int i = small; i <= big; i++) {
                        listInteger.add(i);
                    }
                    list.add(listInteger);
                }
            }

            big++;
            curSum += big;
        }

        return list;
    }

//    public static void main(String[] args) {
//        Test test = new Test();
//        ArrayList<ArrayList<Integer>> list = test.FindContinuousSequence(9);
//        System.out.println(list);
//
//        FindContinuousSequence findContinuousSequence = new FindContinuousSequence();
//        ArrayList<ArrayList<Integer>> list1= findContinuousSequence.findContinuousSequence_Solution(9);
//        System.out.println(list1);
//    }
}
