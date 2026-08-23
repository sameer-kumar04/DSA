package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.printList();

        list.delete(1);
        list.delete(2);
        list.delete(4);
        list.printList();

        list.getLength();
    }
}
