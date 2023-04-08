import java.io.*;

public class Main {
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
                        Methods.Transfer(message);
                        Methods.Process();
                        double endTime = System.currentTimeMillis();
                        double time = endTime - beginTime;
                        System.out.println(" |Time: " + time + "ms");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    Methods.Print();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 3);
    }
}