package zhaohangxinyongka;

import java.util.Scanner;

/**
 * 年会抢玩偶游戏
 *
 * 某公司年会上，组织人员安排了一个小游戏来调节气氛。游戏规则如下：
 *
 * N个人参与游戏，站成一排来抢工作人抛来的M个小玩偶。为了增加游戏的趣味和难度，规则规定，参与游戏的人抢到的礼物不能比左右两边的人多两个或以上，否则会受到一定的惩罚。游戏结束时拥有玩偶最多的人将获得一份大奖。
 * 假设大家都想赢得这份大奖，请问站在第K个位置的小招在赢得游戏时，最多能拥有几个玩偶？
 *
 * 输入描述:
 * 输入为用空格分隔的3个正整数，依次为：参与游戏人数N、玩偶数M、小招所在位置K
 *
 * 输出描述:
 * 输出为1个正整数，代表小招最多能够拥有的玩偶数。若没有，则输出0。
 *
 * 示例1
 * 输入
 * 1 1 0
 * 输出
 * 0
 * 示例2
 * 输入
 * 1 3 1
 * 输出
 * 3
 *
 * 从K位置开始向左右两边分别是两个递减的等差数列。
 * 两个while循环分别是来计算左右边的每个值如果和K一样大的话的差值
 * 假如K位置上的数是result，呢么result * N - diffeerenceSum = M，就可以得到result的数学表达式从而得出最后的结果
 * Created by wangshuyang on 2018-8-30.
 */
public class GrabTheDoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int left = K;
        int right = K;
        int differenceSum = 0;
        int result = 0;
        if (K == 0 || K > N) {
            System.out.println(0);
        }
        while (left >= 1) {
            differenceSum += K - left;
            left--;
        }
        while (right <= N) {
            differenceSum += right - K;
            right++;
        }
        result = (M + differenceSum) / N;
        System.out.println(result);
    }
}
