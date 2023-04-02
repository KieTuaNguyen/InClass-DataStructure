public abstract class Stack {
  protected int size;

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public abstract void push(Object item);

  public abstract Object pop();

  public abstract Object peek();
}
