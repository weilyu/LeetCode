package solutions;

import java.util.Stack;

/**
 * Created by wei on 7/22/2016.
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode starter = new ListNode(0);
        starter.next = head;
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.add(head);
            head = head.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        if (stack.size() == 0)
            starter.next = starter.next.next;
        else {
            ListNode curr = stack.pop();
            curr.next = curr.next.next;
        }
        return starter.next;
    }
}
