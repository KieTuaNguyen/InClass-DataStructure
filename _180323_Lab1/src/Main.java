import implementations.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size: " + stack.size());
        System.out.println("The stack includes: " + stack.toString());
        System.out.println("---");
        System.out.println("Peek an element: " + stack.peek());
        System.out.println("The stack includes: " + stack.toString());
        System.out.println("---");
        System.out.println("Pop an element: ");
        stack.pop();
        System.out.println("Stack size: " + stack.size());
        System.out.println("The stack includes: " + stack.toString());
        System.out.println("---");
    }
}