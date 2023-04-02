package implementations;

import java.util.*;

import interfaces.AbstractStack;

public class Stack<E> implements AbstractStack<E> {
    private E[] elements;
    private int size;

    public Stack() {
        this.elements = (E[]) new Object[10];
        this.size = 0;
    }

    public void push(E element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
