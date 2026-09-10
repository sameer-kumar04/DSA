package linkedlist;
//Tortoise and hare method (Optimal Approach)
public class Cycledetection {
    public static boolean isCycle(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while ( fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;

            if ( slow == fast ) {
                return true;
            }
        }

        return false;
    }
}
