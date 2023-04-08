import implementations.Queue;
import implementations.Stack;

import java.io.*;
import java.util.*;

public class Methods {
  public static Queue<String> queue = new Queue<>();
  public static Stack<String> stack = new Stack<>();

  public static String[] EnterMessage(BufferedReader reader) throws IOException {
    String[] message = reader.readLine().split("//");
    int i = 0;
    while (i < message.length) {
      if (message[i].length() <= 0) {
        throw new IllegalArgumentException("Warning: Empty message ignored.");
      } else if (message[i].length() >= 250) {
        throw new IllegalArgumentException("Warning: Message exceeds 250 characters and will be truncated.");
      } else {
        break;
      }
    }
    return message;
  }

  public static void Transfer(String[] message) {
    int i = 0;
    while (i < message.length) {
      queue.enqueue(message[i]);
      i++;
    }
    System.out.println("Message transferred to queue!");
    System.out.println("Length of message: " + message.length);
  }

  public static void Process() {
    String character;
    while (!queue.isEmpty()) {
      character = queue.peek();
      stack.push(character);
      queue.dequeue();
    }
  }

  public static void Print() {
    String destination;
    System.out.println("Received message: ");
    while (!stack.isEmpty()) {
      destination = stack.peek();
      System.out.println(destination + ". ");
      stack.pop();
    }
  }

  public static void Menu() {
    System.out.println("1. Enter message");
    System.out.println("2. Print message");
    System.out.println("3. Exit");
  }
}