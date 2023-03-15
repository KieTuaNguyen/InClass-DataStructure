package main.implementations;

import main.interfaces.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    private E[] elements;

    public ArrayList(int defaultCapacity) {
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    private E[] grow() {
        return Arrays.copyOf(elements, elements.length * 2);
    }

    private void insert(int index, E element) {
        if (size == elements.length) {
            elements = grow();
        }
        E lastElement = elements[size - 1];
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        elements[size++] = lastElement;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private E getElement(int index) {
        return elements[index];
    }

    private void ensureCapacity() {
        if (size < elements.length / 3) {
            elements = shrink();
        }
    }

    private E[] shrink() {
        return Arrays.copyOf(elements, elements.length / 2);
    }

    private void shift(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
    }

    @Override
    public boolean add(E element) {
        // Add element to the end of the list => return true
        // Increase the size of the list
        // Ensure that the list has enough space to add the element
        // If not, create a new array with double the size of the current array
        // Copy the elements from the current array to the new array

        if (size == elements.length) {
            elements = grow();
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        checkIndex(index);
        insert(index, element);
        return true;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return getElement(index);
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldElement = getElement(index);
        elements[index] = element;
        return oldElement;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E element = getElement(index);
        elements[index] = null;
        size--;
        shift(index);
        ensureCapacity();
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return elements[index++];
            }
        };
    }
}
