import java.io.*;

import implementations.Queue;
import implementations.Stack;

public class Main {
    public static Queue<String> queue = new Queue<>();
    public static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        Methods.Menu();
        System.out.println("Enter your choice: ");
        int choice = 0;
        do {
            try {
                choice = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter message (End with //)");
                    try {
                        String[] message = Methods.EnterMessage(new BufferedReader(new InputStreamReader(System.in)));
                        double beginTime = System.currentTimeMillis();
                        Methods.Transfer(message, queue);
                        Methods.Process(queue, stack);
                        double endTime = System.currentTimeMillis();
                        double time = endTime - beginTime;
                        System.out.println(" |Time: " + time + "ms");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Methods.PrintNewestMessage(stack);
                    break;
                case 3:
                    Methods.PrintAllMessages();
                    break;
                case 4:
                    Methods.ExportAllMessages();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 5);
    }
}