package linkedlist;

public class FIndmiddleoflinkedlist {
    public static LinkedList.Node findMiddle(LinkedList.Node head) {
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;

        while ( fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
