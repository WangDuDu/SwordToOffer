/**
 * Created by wangshuyang on 2018-8-31.
 *
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class ComplexLinkedList {
    public RandomListNode clone(RandomListNode pHead)
    {
        if (pHead == null) {
            return null;
        }
        RandomListNode temp = pHead;
        while (temp != null) {
            RandomListNode cloneNode = new RandomListNode(temp.label);
            cloneNode.next = temp.next;
            temp.next = cloneNode;
            temp = temp.next.next;
        }
        temp = pHead;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = pHead;
        RandomListNode cloneNode = temp.next;
        RandomListNode cloneHead = temp.next;
        while (temp != null) {
            temp.next = temp.next.next;
            if (cloneNode.next != null) {
                cloneNode.next = cloneNode.next.next;
            }
            temp = temp.next;
            cloneNode = cloneNode.next;
        }
        return cloneHead;
    }
}
