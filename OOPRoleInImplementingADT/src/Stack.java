public class Stack {
  private int[] elements;
  private int top;
  private int size;

  public Stack() {
    elements = new int[16];
    top = -1;
    size = 0;
  }

  public Stack(int capacity) {
    elements = new int[capacity];
    top = -1;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int peek() {
    return elements[top];
  }

  public int pop() {
    int value = elements[top];
    top--;
    size--;
    return value;
  }

  public void push(int value) {
    top++;
    elements[top] = value;
    size++;
  }
}