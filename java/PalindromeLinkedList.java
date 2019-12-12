package solutions;

import java.util.Stack;

/**
 * Created by wei on 7/20/2016.
 * https://leetcode.com/problems/palindrome-linked-list/
 * Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> s = new Stack();
        ListNode pt = head;
        while (pt != null) {
            s.add(pt);
            pt = pt.next;
        }
        while (head != null) {
            ListNode curr = s.pop();
            if (curr.val != head.val)
                return false;
            head = head.next;
        }
        return true;
    }
}
