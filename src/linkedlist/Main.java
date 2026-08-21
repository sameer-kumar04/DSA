package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);


        list.append(2);
        list.append(3);
//        System.out.println(list.removeFirst().value);

        list.printList();
        System.out.println(list.get(2).value);
    }
}
