package linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(0);
        list.append(1);
        list.append(2);

        list.remove(1);

        list.printList();
    }
}
