import implementations.Queue;
import implementations.Stack;

import java.io.*;
import java.util.*;

public class Methods {
  public static Queue<String> queue;
  public static Stack<String> stack;
  public static LinkedList<String> messageList = new LinkedList<>();

  public static void setQueue(Queue<String> q) {
    queue = q;
  }

  public static void setStack(Stack<String> s) {
    stack = s;
  }

  public static void Menu() {
    System.out.println("----------------------------------------");
    System.out.println("|1| Enter message                      |");
    System.out.println("|2| Print the newest conversation      |");
    System.out.println("|3| Print all conversations            |");
    System.out.println("|4| Export all conversations to a file |");
    System.out.println("|5| Exit                               |");
    System.out.println("----------------------------------------");
    System.out.print("    Enter your choice: ");
  }

  public static String[] EnterMessage(BufferedReader reader) throws IOException {
    String[] message = reader.readLine().split("//");
    int i = 0;
    while (i < message.length) {
      if (message[i].length() <= 0) {
        System.out.println("Warning: Empty message ignored.");
      } else if (message[i].length() >= 250) {
        System.out.println("Warning: Message exceeds 250 characters and will be truncated.");
      } else {
        break;
      }
    }
    messageList.addLast(Arrays.toString(message));
    return message;
  }

  public static void Transfer(String[] message, Queue<String> queue) {
    int i = 0;
    while (i < message.length) {
      queue.enqueue(message[i]);
      i++;
    }
    System.out.println("    Message transferred to queue!");
    System.out.println("    Length of message: " + message.length);
  }

  public static void Process(Queue<String> queue, Stack<String> stack) {
    String character;
    while (!queue.isEmpty()) {
      character = queue.peek();
      stack.push(character);
      queue.dequeue();
    }
  }

  public static void PrintNewestMessage(Stack<String> stack) {
    String message;
    System.out.println("Received messages: ");
    while (!stack.isEmpty()) {
      message = stack.peek();
      System.out.println(message + ". ");
      stack.pop();
    }
    System.out.println();
  }

  public static void PrintAllMessages() {
    System.out.println("All messages received:");
    messageList.forEach(System.out::println);
  }

  public static void ExportAllMessages() {
    try {
      File file = new File("src/conversation/history.txt");
      FileWriter writer = new FileWriter(file);

      messageList.forEach(message -> {
        try {
          writer.write(message + "\n");
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
      writer.close();
      System.out.println("All messages exported to file: " + file.getAbsolutePath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}