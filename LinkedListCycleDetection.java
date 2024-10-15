import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleDetection {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;

        while(current != null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current = current.next;
        }

        return false;
    }

    /*
    alternative:
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
    */
}
