/**
 * Created by wangshuyang on 2018/5/15.
 *
 * 反转单词序列
 *
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 *
 * 1.首先把整个String变成一个char类型的数组
 * 2.将整个句子进行翻转
 * 3.然后将每个单词进行翻转（当high为‘ ’或者high已经到达了数组的末尾那么就进行翻转）
 */
public class ReverseSentence {
//    public static String reverseSentence_Reslotion(String str) {
//        if (str == " ")
//            return " ";
//        String[] stringArray = str.split(" ");
//        reverse(0, stringArray.length-1, stringArray);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < stringArray.length; i++) {
//            stringBuilder.append(stringArray[i]);
//            if (i < stringArray.length - 1) {
//                stringBuilder.append(" ");
//            }
//        }
//        String result = stringBuilder.toString();
//        return result;
//    }
//
//    public static void reverse (int start, int end, String[] array) {
//        String temp;
//        while (start < end) {
//            temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//        String input = " ";
//        String result = reverseSentence_Reslotion(input);
//        System.out.println("result:" + result + "result");
//
//    }



//    public String ReverseSentence(String str) {
//        char[] charArray = new char[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            charArray[i] = str.charAt(str.length() - 1 - i);
//        }
//
//        int low = 0;
//        int high = 0;
//
//        while (low < str.length() && high < str.length()) {
//            while (high < str.length() && charArray[high] != ' ') {
//                high++;
//            }
//            reverse(low, high - 1, charArray);
//            while (high < str.length() && charArray[high] == ' ') {
//                high++;
//            }
//            low = high;
//        }
//
//        return new String(charArray);
//    }

    public static String reverseSentence_Reslotion(String str) {
        char[] charArray = str.toCharArray();
        reverse(0, charArray.length - 1, charArray);
        int low = 0;
        int high =0;
        while (low < charArray.length && high < charArray.length) {
            if (charArray[low] == ' ') {
                low++;
                high++;
            } else if (charArray[high] == ' ') {
                reverse(low, high - 1, charArray);
                high++;
                low = high;
            } else if (high == charArray.length - 1){
                reverse(low, high, charArray);
                high++;
                low = high;
            } else {
                high++;
            }
        }

        String result = new String(charArray);
        return result;
    }

    public static void reverse (int start, int end, char[] array) {
        char temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String input = "I am a student.";
        String result = reverseSentence_Reslotion(input);
        System.out.println("result:" + result);

    }
}
