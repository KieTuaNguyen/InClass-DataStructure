package implementations;

import interfaces.LinkedList;

import java.util.Iterator;

public class SinglyLinkedList<E> implements LinkedList<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public SinglyLinkedList() {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<E> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    @Override
    public void addAtIndex(E element, int index) {
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            this.addFirst(element);
        } else if (index == this.size) {
            this.addLast(element);
        } else {
            Node<E> current = this.head;
            Node<E> previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
            newNode.next = current;
            this.size++;
        }
    }

    @Override
    public E removeFirst() {
        if (this.head == null) {
            throw new IllegalStateException("The list is empty!");
        }
        E element = this.head.element;
        this.head = this.head.next;
        this.size--;
        return element;
    }

    @Override
    public E removeLast() {
        if (this.head == null) {
            throw new IllegalStateException("The list is empty!");
        }
        Node<E> current = this.head;
        Node<E> previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        E element = current.element;
        previous.next = null;
        this.size--;
        return element;
    }

    @Override
    public E removeAtIndex(int index) {
        if (index == 0) {
            return removeFirst();
        } else if (index == this.size - 1) {
            return removeLast();
        } else {
            Node<E> current = this.head;
            Node<E> previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            E element = current.element;
            previous.next = current.next;
            this.size--;
            return element;
        }
    }

    @Override
    public E getFirst() {
        if (this.head == null) {
            throw new IllegalStateException("The list is empty!");
        }
        return this.head.element;
    }

    @Override
    public E getLast() {
        if (this.head == null) {
            throw new IllegalStateException("The list is empty!");
        }
        Node<E> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public E getAtIndex(int index) {
        if (this.head == null) {
            throw new IllegalStateException("The list is empty!");
        }
        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = this.head;
        while (current != null) {
            sb.append(current.element).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
