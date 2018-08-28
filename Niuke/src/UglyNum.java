/**
 * Created by wangshuyang on 2018/4/10.
 * 丑数
 *
 * 把只包含质数因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 * 1.一个丑数乘以2,3,5就会得到一个新的丑数
 * 2.首先用i2，i3，i5来记录该位置有没有乘以过2,3,5
 * 3.每次把i2，i3，i5位置的三个数分别乘以2,3,5找出其中最小的一个，作为下一个丑数
 * 4.用了那个位置的数那个位置向后移一下
 */
public class UglyNum {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int count = 0;
        int[] uglyNum = new int[index];
        uglyNum[0] = 1;

        while (count < index-1) {
            int min = getMin(uglyNum[i2] * 2, uglyNum[i3] * 3, uglyNum[i5] * 5);
            if (min == uglyNum[i2] * 2) {
                i2++;
            }
            if (min == uglyNum[i3] * 3) {
                i3++;
            }
            if (min == uglyNum[i5] * 5) {
                i5++;
            }
            uglyNum[++count] = min;
        }

        return uglyNum[count];
    }

    public int getMin (int a, int b, int c) {
        int min;
        min = a < b ? a : b;
        min = min < c ? min : c;
        return min;
    }
}
