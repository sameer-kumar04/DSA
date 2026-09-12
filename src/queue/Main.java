package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        queue.printQueue();

        queue.dequeue();

        System.out.println("After Dequeue");
        queue.printQueue();
    }
}
