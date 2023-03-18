import implementations.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Queue<Integer> queue = new Queue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue size: " + queue.size());
        System.out.println("The queue includes: " + queue.toString());
        System.out.println("---");
        System.out.println("Peek an element: " + queue.peek());
        System.out.println("The queue includes: " + queue.toString());
        System.out.println("---");
        System.out.println("Poll an element: ");
        queue.poll();
        System.out.println("Queue size: " + queue.size());
        System.out.println("The queue includes: " + queue.toString());
        System.out.println("---");
    }
}