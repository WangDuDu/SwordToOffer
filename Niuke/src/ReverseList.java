/**
 * Created by wangshuyang on 2018-9-2.
 * 反转链表
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }
}
