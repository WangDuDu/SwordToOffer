/**
 * Created by wangshuyang on 2018/4/16.
 * 两个链表的第一个公共节点
 *
 * 1.首先计算出两个链表的长度
 * 2.然后长的链表先走两个链表的长度差
 * 3.两个链表一起往前走直到找到第一个公共节点
 *
 */
public class FindFirstCommonNode {

    public ListNode findFirstCommonNode_Solution (ListNode pHead1, ListNode pHead2) {
        ListNode test1 = pHead1;
        ListNode test2 = pHead2;
        int length1 = 0;
        int length2 = 0;
        ListNode result = pHead1;
        while (test1 != null) {
            test1 = test1.next;
            length1++;
        }
        while (test2 != null) {
            test2 = test2.next;
            length2++;
        }
        if(length1 > length2) {
            for (int i = 0; i < Math.abs(length1 - length2); i++) {
                pHead1 = pHead1.next;
            }
        } else {
            for (int i = 0; i < Math.abs(length1 - length2); i++) {
                pHead2 = pHead2.next;
            }
        }
        while (pHead1 != null && pHead1 != pHead2) {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
        }
        if (pHead1 == pHead2) {
            result = pHead1;
        }
        return result;

    }
}
