package solutions;

import java.util.HashSet;

/**
 * Created by wei on 2016/10/27.
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            set.add(head);
            ListNode curr = head.next;
            if (curr == null)
                return null;
            if (set.contains(curr))
                return curr;
            else head = curr;
        }
        return null;
    }

}
