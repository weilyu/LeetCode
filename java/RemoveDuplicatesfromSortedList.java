package solutions;

/**
 * Created by wei on 7/19/2016.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        while (head.next != null && head.val == head.next.val)
            head.next = head.next.next;
        deleteDuplicates(head.next);
        return head;
    }
}
