package implementations;

import interfaces.LinkedList;

import java.util.Iterator;

public class SinglyLinkedList<E> implements LinkedList<E> {
  private Node<E> head;
  private Node<E> tail;
  private int size;

  private static class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    if (this.size == 0) {
      throw new IllegalStateException("The linked list is empty");
    } else {
      return false;
    }
  }

  @Override
  public void addFirst(E element) {
    Node<E> newNode = new Node<>(element);
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  @Override
  public void addLast(E element) {
    Node<E> newNode = new Node<>(element);
    if (this.head == null) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.next = newNode;
      this.tail = newNode;
    }
  }

  @Override
  public E removeFirst() {
    if (this.head == null) {
      throw new IllegalStateException("The linked list is empty!");
    }
    E element = this.head.element;
    this.head = this.head.next;
    this.size--;
    return element;
  }

  @Override
  public E removeLast() {
    if (this.head == null) {
      throw new IllegalStateException("The linked list is empty!");
    }
    E element = this.tail.element;
    Node<E> current = this.head;
    while (current.next != this.tail) {
      current = current.next;
    }
    this.tail = current;
    this.tail.next = null;
    this.size--;
    return element;
  }

  @Override
  public E getFirst() {
    if (this.head == null) {
      throw new IllegalStateException("The linked list is empty!");
    }
    return this.head.element;
  }

  @Override
  public E getLast() {
    if (this.head == null) {
      throw new IllegalStateException("The linked list is empty!");
    }
    Node<E> current = this.head;
    while (current.next != null) {
      current = current.next;
    }
    return current.element;
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      private Node<E> current = head;

      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public E next() {
        E element = current.element;
        current = current.next;
        return element;
      }
    };
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