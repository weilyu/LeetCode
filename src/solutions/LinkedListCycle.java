package solutions;

import java.util.HashSet;

/**
 * Created by wei on 7/19/2016.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        if (head == null || head.next == null) return false;
        hs.add(head);
        while (head.next != null) {
            if (hs.contains(head.next))
                return true;
            else {
                hs.add(head.next);
                head = head.next;
            }
        }
        return false;
    }
}
