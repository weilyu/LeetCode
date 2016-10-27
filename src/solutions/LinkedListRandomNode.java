package solutions;

import java.util.ArrayList;

/**
 * Created by wei on 2016/09/05.
 */
public class LinkedListRandomNode {
    ArrayList<ListNode> al = new ArrayList<>();
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        al.add(head);
        while (head.next != null){
            al.add(head.next);
            head = head.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int position = (int) Math.floor(al.size() * Math.random());
        return al.get(position).val;
    }
}
