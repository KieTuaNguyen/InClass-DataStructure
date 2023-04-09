import java.io.*;

import implementations.Queue;
import implementations.Stack;

public class Main {
    public static Queue<String> queue = new Queue<>();
    public static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("    KMessage                      v1.0.0");
        Methods.Menu();
        int choice = 0;
        do {
            try {
                String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if (input.isEmpty()) {
                    System.out.println("Invalid choice! Please enter a number.");
                    continue;
                }
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please enter a number.");
                continue;
            } catch (IOException e) {
                System.out.println("Invalid choice! Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("    Enter message (End with //)");
                    try {
                        String[] message = Methods.EnterMessage(new BufferedReader(new InputStreamReader(System.in)));
                        double beginTime = System.currentTimeMillis();
                        Methods.Transfer(message, queue);
                        Methods.Process(queue, stack);
                        double endTime = System.currentTimeMillis();
                        double time = endTime - beginTime;
                        System.out.println("|*| Time: " + time + "ms");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Methods.Menu();
                    break;
                case 2:
                    Methods.PrintNewestMessage(stack);
                    Methods.Menu();
                    break;
                case 3:
                    Methods.PrintAllMessages();
                    Methods.Menu();
                    break;
                case 4:
                    Methods.ExportAllMessages();
                    Methods.Menu();
                    break;
                case 5:
                    System.out.println("----------------------------------------");
                    System.out.println("    KMessage                      v1.0.0");
                    System.out.println("----------------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number.");
                    break;
            }
        } while (choice != 5);
    }
}