package solutions;

/**
 * Created by wei on 7/22/2016.
 * https://leetcode.com/problems/remove-linked-list-elements/
 * Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode starter = new ListNode(0);
        starter.next = head;
        ListNode pt = starter;
        while (pt.next != null) {
            if (pt.next.val == val) {
                pt.next = pt.next.next;
            } else {
                pt = pt.next;
            }
        }
        return starter.next;
    }
}
