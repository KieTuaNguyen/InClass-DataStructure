import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Kiet!");
        // Default initialization
        Stack defaultStack = new Stack();

        // Initialization with initial capacity
        Stack<String> stack = new Stack<String>();

        // Pushing elements into the stack
        defaultStack.push("Kiet");
        defaultStack.push("Tuan");
        defaultStack.push("Nguyen");
        defaultStack.push("GDD210002");

        stack.push("Assignment 1");
        stack.push("Data Structure");
        stack.push("Algorithm");

        // Displaying the Stack
        System.out.println("   Default Stack: " + defaultStack);
        System.out.println("   Stack: " + stack);
    }
}