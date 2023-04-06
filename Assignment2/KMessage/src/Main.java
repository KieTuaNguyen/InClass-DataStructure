import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("KMessage");
        System.out.println("Enter message (End with //)");
        try {
            String[] message = Methods.EnterMessage();
            double beginTime = System.currentTimeMillis();
            Methods.Transfer(message);
            Methods.Process();
            Methods.Print();
            double endTime = System.currentTimeMillis();
            double time = endTime - beginTime;
            System.out.println("Time: " + time + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}