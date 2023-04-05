package interfaces;

public interface AbstractQueue<E> extends Iterable<E> {
    void enQueue(E item);

    E deQueue();

    E peek();

    int size();

    boolean isEmpty();
}