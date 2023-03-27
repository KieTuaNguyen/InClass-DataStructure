import java.util.*;

public class Main {
    // Pushing elements into the stack
    public static void push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping elements from the stack
    public static void pop(Stack<Integer> stack) {
        System.out.println("Pop: ");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying the top element of the stack
    public static void peek(Stack<Integer> stack) {
        System.out.println("The top element in Stack:");
        System.out.println(stack.peek());
    }

    // Searching an element in the stack
    public static void search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    public static void main(String[] args) {
        System.out.println("Hello Kiet!");
        Stack<Integer> stack = new Stack<Integer>();

        push(stack);
        pop(stack);
        System.out.println("---");
        push(stack);
        peek(stack);
        System.out.println("---");
        search(stack, 2);
        search(stack, 4);
        search(stack, 6);
        System.out.println("---");

    }
}