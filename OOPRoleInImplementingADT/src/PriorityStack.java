public class PriorityStack extends Stack {
  public PriorityStack(int size) {
    super(size);
  }

  public void insert(int value) {
    if (isFull()) {
      System.out.println("Stack is full. Cannot insert element.");
    } else {
      stackArray[++top] = value;
    }
  }

  public int removeMin() {
    if (isEmpty()) {
      System.out.println("Stack is empty. Cannot remove element.");
      return -1;
    } else {
      int min = stackArray[0];
      int minIndex = 0;
      for (int i = 1; i <= top; i++) {
        if (stackArray[i] < min) {
          min = stackArray[i];
          minIndex = i;
        }
      }
      for (int i = minIndex; i < top; i++) {
        stackArray[i] = stackArray[i + 1];
      }
      top--;
      return min;
    }
  }
}