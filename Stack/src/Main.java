import java.util.*;

public class Main {
    public static int square(int x) {
        return x * x;
    }

    public static int sumOfSquares(int x, int y) {
        return square(x) + square(y);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int sum = sumOfSquares(x, y);
        System.out.println("The sum of squares of " + x + " and " + y + " is " + sum + ".");
    }
}
