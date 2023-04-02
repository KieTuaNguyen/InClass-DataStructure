import implementations.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Kiet");
        stringStack.push("Nguyen");
        stringStack.push("GDD210002");
        System.out.println("Stack size: " + stringStack.size());

        System.out.println("Top element: " + stringStack.peek());

        String poppedElement = stringStack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack size after pop: " + stringStack.size());

        System.out.println("Elements in the stack:");
        for (int i = 0; i < stringStack.size(); i++) {
            System.out.println(stringStack.pop());
        }
    }
}