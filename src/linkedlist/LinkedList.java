package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while ( temp != null ) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if ( length == 0) { //if list is empty you can also do : tail == null or head == null
            tail = newNode;
            head = newNode;
        }
        else {//if list has nodes in it
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public Node removeFirst() {
        if ( length == 0 ) { //if list is empty
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if( length == 0) {//edge case for if 1 node left in the list
            tail = null;
        }

        return temp;
    }

    public Node removeLast() {
        if ( length == 0 ) { //if list is empty you can also do : tail == null or head == null
            return null;
        }

        Node temp = head;
        Node pre = head;

        while ( temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if ( length == 0 ){ // after decrementing the length , head and tail is pointing to the one element
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if ( length == 0 ) { //if list is empty
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public void getHead() {
        System.out.println("Head : " + head.value);
    }

    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }
}
