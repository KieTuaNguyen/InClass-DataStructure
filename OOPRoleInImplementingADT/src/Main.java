public class Main {
    public static void main(String[] args) {
        PriorityStack priorityStack = new PriorityStack(5);
        priorityStack.push(3);
        priorityStack.push(1);
        priorityStack.push(2);
        System.out.println(priorityStack.removeMin());

        priorityStack.push(4);
        System.out.println(priorityStack.removeMin());
    }
}