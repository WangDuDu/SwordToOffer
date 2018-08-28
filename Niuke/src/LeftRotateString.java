/**
 * Created by wangshuyang on 2018/5/10.
 * 左旋转字符串
 *
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 *
 * 1.首先将前n个字符放到一个临时的数组中
 * 2.然后将该前移的元素前移
 * 3.将临时数组中的元素添加到要得到的结果数组中，将数组转化为字符串
 */
public class LeftRotateString {
    public String leftRotateString_Solution(String str,int n) {
        if (str == "" || str.length() == 0)
            return "";

        char[] charArray = new char[str.length()];
        charArray = str.toCharArray();

        int i;
        char[] temp = new char[n];
        for (i = 0; i < n; i++) {
            temp[i] = charArray[i];
        }

        int j;
        for (j = 0; j < str.length()-n; j++) {
            charArray[j] = charArray[j+n];
        }

        int k , m = 0;
        for (k = j; k < str.length(); k++) {
            charArray[k] = temp[m];
            m++;
        }

        String result = new String(charArray);
        return result;
    }
}
