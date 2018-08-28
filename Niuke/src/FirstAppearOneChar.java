/**
 * Created by wangshuyang on 2018/4/10.
 * 第一个只出现一次的字符
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 *
 * 1.将字符串转化为字符数组
 * 2.创建一个int类型的数组，数组的下标为每个字符的ASCII码
 * 3.遍历char的数组，统计数组中每一个字符出现的次数，放在对应下标的int类型的数组中
 * 4.遍历char的数组，找到第一个只出现了一次的字符
 */
public class FirstAppearOneChar {
    public int FirstNotRepeatingChar(String string) {
        char[] charArray = string.toCharArray();
        int[] intArray = new int['z' + 1];

        for (char c : charArray) {
            intArray[(int) c]++;
        }

        for (int i = 0; i < string.length(); i++) {
            if (intArray[(int) charArray[i]] == 1)
                return i;
        }

        return -1;
    }
}
