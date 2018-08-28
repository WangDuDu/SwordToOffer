/**
 * Created by wangshuyang on 2018-4-6.
 * 连续子数组的最大和
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
 *
 * 这道题的思路就是求以数组中每个数结尾的子数组的和,然后选出其中最大的那个
 */
public class GreatestSumOfSubArray {

    public static int FindGreatestSumOfSubArray (int array[]) {
        if (array.length == 0)
            return 0;
        int sumMax = array[0]; // 记录以array[i]结尾的子数组和最大值
        int finalMax = array[0]; // 记录最大子数组的和

        for (int i = 1; i < array.length; i++) {
            /*
             * 如果以array[i-1]的最大子数组的和是小于0的话那么不管array[i]是否大于0,以array[i]结尾的最大子数组的和为array[i]
             * 如果以array[i-1]的最大子数组的和是大于0的话那么不管array[i]是否大于0,以array[i]结尾的最大子数组的和为array[i]+sumMax
             */
            if (sumMax < 0)
                sumMax = array[i];
            else
                sumMax += array[i];

            finalMax = finalMax > sumMax ? finalMax : sumMax;
        }

        return finalMax;
    }
}
