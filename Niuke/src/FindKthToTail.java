/**
 * Created by wangshuyang on 2018-9-3.
 * 链表中的倒数第K个节点
 */
public class FindKthToTail {
    public ListNode fndKthToTail(ListNode head,int k) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (head != null) {
            length++;
            head = head.next;
        }
        if (k > length) {
            return null;
        }

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
