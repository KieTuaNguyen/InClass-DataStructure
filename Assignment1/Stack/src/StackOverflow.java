public class StackOverflow {
  public static void main(String[] args) {
    int x = calculateFactorial(10000); // This will cause a stack overflow
    System.out.println(x);
  }

  public static int calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * calculateFactorial(n - 1); // Recursive call without exit condition
    }
  }
}