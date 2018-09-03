/**
 * Created by wangshuyang on 2018-9-2.
 * 合并两个排序的链表
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeLinkedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = new ListNode(-1);
        temp.next = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                head.next = list2;
                list2 = list2.next;
                head = head.next;
            } else {
                head.next = list1;
                list1 = list1.next;
                head = head.next;
            }
        }
        while (list1 != null) {
            head.next = list1;
            list1 = list1.next;
            head = head.next;
        }
        while (list2 != null) {
            head.next = list2;
            list2 = list2.next;
            head = head.next;
        }
        return temp.next.next;

    }
}
