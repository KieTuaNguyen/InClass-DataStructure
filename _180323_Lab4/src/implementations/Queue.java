package implementations;

import interfaces.AbstractQueue;

import java.util.Iterator;

public class Queue<E> implements AbstractQueue<E> {
    // Using Array
    private E[] elements;
    private int size;

    public Queue() {
        this.elements = (E[]) new Object[999];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void offer(E element) {
        if (this.size == this.elements.length) {
            this.elements = this.grow();
        }
        this.elements[this.size++] = element;
    }

    private E[] grow() {
        E[] newElements = (E[]) new Object[this.elements.length * 2];
        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        return newElements;
    }

    @Override
    public E poll() {
        ensureNonEmpty();
        E element = this.elements[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[--this.size] = null;
        return element;
    }

    @Override
    public E peek() {
        ensureNonEmpty();
        return this.elements[0];
    }

    private void ensureNonEmpty() {
        if (this.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            sb.append(this.elements[i]);
            if (i < this.size - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
