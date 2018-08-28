import java.util.LinkedList;

/**
 * Created by wangshuyang on 2018/5/22.
 *
 * 孩子们的游戏（约瑟夫环）
 *
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
 * 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,
 * 并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 */
public class LastRemaining {
    public static int lastRemaining_Solution(int m, int n) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) { //将每个小朋友加入到list当中去
            list.add(i);
        }

        int out = 0; // out代表的是每次被选中的小朋友的编号，初始值设为0

        while (list.size() > 1) { // 当列表中只剩一个小朋友的时候就跳出循环
            out = (out + m - 1) % list.size(); // 求出这一轮要选中小朋友的位置
            list.remove(out); // 将这个小朋友移除列表
        }

        return list.size() == 1 ? list.get(0) : -1; // 返回最后剩下的小朋友的编号
    }
}
