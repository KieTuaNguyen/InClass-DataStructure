package interfaces;

public interface AbstractStack<E> {
    void push(E element);

    E pop();

    E peek();

    int size();

    boolean isEmpty();
}
