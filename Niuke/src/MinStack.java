import java.util.Stack;

/**
 * Created by wangshuyang on 2018-9-1.
 * 包含min函数的栈
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stackMin = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            if (stackMin.peek() > node) {
                stackMin.push(node);
            } else {
                stackMin.push(stackMin.peek());
            }
        }
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
