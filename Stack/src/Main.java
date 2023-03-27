import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Kiet!");
        // Initialization with initial capacity
        Stack<String> stack = new Stack<String>();

        // Pushing elements into the stack
        stack.push("Kiet Tuan Nguyen");
        stack.push("GDD210002");
        stack.push("Assignment 1");
        stack.push("Data Structure");

        // Accessing the elements in Stack:
        // Displaying the size of Stack
        System.out.println("   Size of Stack: " + stack.size());
        // Displaying the Stack
        System.out.println("   Stack: " + stack);
        // Displaying the top element of Stack
        System.out.println("   Top element of Stack: " + stack.peek());
    }
}