package implementations;

import interfaces.AbstractQueue;

import java.util.Iterator;

public class LinkedListQueue<E> implements AbstractQueue<E> {

  private Node<E> head;
  private int size;

  private static class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }

  public LinkedListQueue() {
    this.head = null;
    this.size = 0;
  }

  @Override
  public void enQueue(E item) {
    Node<E> newNode = new Node<>(item);
    if (this.head == null) {
      this.head = newNode;
    } else {
      Node<E> lastNode = this.head;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      lastNode.next = newNode;
    }
    this.size++;
  }

  @Override
  public E deQueue() {
    ensureNonEmpty();
    E element = this.head.element;
    this.head = this.head.next;
    this.size--;
    return element;
  }

  @Override
  public E peek() {
    ensureNonEmpty();
    return this.head.element;
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  private void ensureNonEmpty() {
    if (this.isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      private Node<E> current = head;

      @Override
      public boolean hasNext() {
        return this.current != null;
      }

      @Override
      public E next() {
        E element = this.current.element;
        this.current = this.current.next;
        return element;
      }
    };
  }
}