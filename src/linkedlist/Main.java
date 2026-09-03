package linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.printList();

        list.reverse();

        list.printList();
    }
}
