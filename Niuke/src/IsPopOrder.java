import java.util.Stack;

/**
 * Created by wangshuyang on 2018-9-1.
 * 栈的亚茹，弹出序列
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class IsPopOrder {
    public boolean solution(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        stack.push(pushA[index++]);
        for (int i = 0; i < popA.length; i++) {
            while (stack.peek() != popA[i]) {
                if (index == pushA.length) {
                    return false;
                } else {
                    stack.push(pushA[index++]);
                }
            }
            stack.pop();
        }
        return true;
    }
}
