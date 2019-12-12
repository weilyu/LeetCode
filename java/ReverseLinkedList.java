package solutions;

import java.util.ArrayList;

/**
 * Created by edwinlyu on 5/22/16.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ArrayList<ListNode> al = new ArrayList<>();
        while (head != null) {
            al.add(head);
            head = head.next;
        }
        for (int i = al.size() - 1; i > 0; i--) {
            al.get(i).next = al.get(i - 1);
        }
        al.get(0).next = null;
        return al.get(al.size() - 1);
    }
}

