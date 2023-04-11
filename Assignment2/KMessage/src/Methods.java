import implementations.Queue;
import implementations.Stack;

import java.io.*;
import java.text.*;
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
    System.out.println("|1| Import the conversation from a file|");
    System.out.println("|2| Leave the messages                 |");
    System.out.println("|3| Retrieve the newest conversation   |");
    System.out.println("|4| Retrieve all conversations         |");
    System.out.println("|5| Export all conversations to a file |");
    System.out.println("|6| Delete the newest conversation     |");
    System.out.println("|7| Statistics                         |");
    System.out.println("|8| Exit                               |");
    System.out.println("----------------------------------------");
    System.out.print(" => Enter your choice: ");
  }

  public static String[] LeaveMessage(BufferedReader reader) throws IOException {
    boolean validMessage = false;
    String[] message = null;

    while (!validMessage) {
      message = reader.readLine().split("//");
      int i = 0;
      validMessage = true;

      while (i < message.length) {
        if (message[i].length() <= 0) {
          System.out.println("    Warning: Empty message ignored.");
          validMessage = false;
          break;
        } else if (message[i].length() >= 250) {
          System.out.println("    Warning: Message exceeds 250 characters and will be truncated.");
          validMessage = false;
          break;
        }
        i++;
      }
    }

    String timestamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());
    String messageWithTimestamp = "[" + timestamp + "] " + Arrays.toString(message);
    messageList.addLast(messageWithTimestamp);
    return message;
  }

  public static void Transfer(String[] message, Queue<String> queue) {
    int i = 0;
    while (i < message.length) {
      queue.enqueue(message[i]);
      i++;
    }
    System.out.println("    Message transferred to queue!");
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
    System.out.println("    Received messages: ");
    while (!stack.isEmpty()) {
      message = stack.peek();
      System.out.println(message + ". ");
      stack.pop();
    }
  }

  public static void PrintAllMessages() {
    System.out.println("    All messages received:");
    // Loop over each message in the messageList variable
    // The loop variable is a String type and it's named message
    for (String message : messageList) {
      // Split the message using the "|" character as the delimiter and store the
      // resulting parts in an array
      String[] parts = message.split("\\|");
      String msg = parts[0].trim();
      String time = "";
      // If the message has at least two parts, get the second part and remove any
      // leading or trailing spaces
      if (parts.length >= 2) {
        time = parts[1].trim();
      }
      System.out.println(msg + " " + time);
    }
  }

  private static boolean isImported = false;

  public static void ImportMessages() {
    if (isImported) {
      System.out.println("    Warning: File already imported.");
      return;
    }

    try {
      File file = new File("src/conversation/history.txt");
      Scanner scanner = new Scanner(file);
      // Loop over each line in the file
      while (scanner.hasNextLine()) {
        // Read the next line and store it in the message variable
        String message = scanner.nextLine();
        // Add the message to the messageList
        messageList.addLast(message);
      }
      // Close the Scanner object to flush any remaining data and release any system
      // resources
      scanner.close();
      System.out.println("All messages imported from file: " + file.getAbsolutePath());
      isImported = true; // set to true after successful import
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void ExportAllMessages() {
    try {
      File file = new File("src/conversation/history.txt");
      FileWriter writer = new FileWriter(file);
      // Loop over each message in the messageList and write it to the file
      for (String message : messageList) {
        writer.write(message + "\n");
      }
      // Close the FileWriter object to flush any remaining data and release any
      // system resources
      writer.close();
      System.out.println("All messages exported to file: " + file.getAbsolutePath());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void DeleteNewestMessage() {
    // Remove the last message from the messageList
    messageList.removeLast();
    System.out.println("    Newest message deleted!");
  }

  public static void Statistics() {
    System.out.println("    Number of conversations received: " + messageList.size());
    int totalLength = 0;
    for (String message : messageList) {
      totalLength += message.length();
    }
    double averageLength = (double) totalLength / messageList.size();
    long roundedAverageLength = Math.round(averageLength);
    System.out.println("    Average length of messages: " + roundedAverageLength);
  }
}