import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by wangshuyang on 2018/5/16.
 *
 * 扑克牌顺子
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
 */
public class IsContinuous {
    public static boolean isContinous_Solution (int[] numbers) {
        if (numbers.length == 0)
            return false;
        int numOfZero = 0;
        int differ = 0;
        Arrays.sort(numbers);
        //统计大小王的个数
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == 0)
                numOfZero++;
        }

        differ = numbers[numbers.length - 1] - numbers[numOfZero];

        //判断给出的五个数中有没有重复的，如果有的话直接返回false
        for (int i = numOfZero; i < 4; i++) {
            if (numbers[i + 1] == numbers[i])
                return false;
        }

        //如果大小王一共有四张的话肯定是顺子，如果有三张那么最大值和最小的的差可以是1,2,3,4
        //两张的话可以是2,3,4，一张的话可以是3,4，没有大小王的话只能是4
        if (numOfZero == 4)
            return true;
        else {
            if (differ <= 4)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,2,5,4};
        if (isContinous_Solution(array))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
