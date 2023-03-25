import implementations.DoublyLinkedList;
import implementations.SinglyLinkedList;

public class Main {
    // SinglyLinkedList
    // public static void main(String[] args) {
    // SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    // System.out.println("AddLast elements: 2, 3, 4");
    // list.addLast(2);
    // list.addLast(3);
    // list.addLast(4);
    // System.out.println("List size: " + list.size());
    // System.out.println(list.toString());
    // System.out.println("---");

    // System.out.println("AddFirst elements: 1");
    // list.addFirst(1);
    // System.out.println("List size: " + list.size());
    // System.out.println(list.toString());
    // System.out.println("---");

    // System.out.println("RemoveFirst ... ");
    // System.out.println("RemoveLast ... ");
    // System.out.println("List size: " + list.size());
    // System.out.println(list.toString());
    // System.out.println("---");

    // System.out.println("AddAtIndex elements: At index 2, add 7");
    // list.addAtIndex(7, 2);
    // System.out.println("List size: " + list.size());
    // System.out.println(list.toString());
    // System.out.println("---");

    // System.out.println("RemoveAtIndex 2 ... ");
    // System.out.println("List size: " + list.size());
    // System.out.println(list.toString());
    // System.out.println("---");

    // System.out.println("GetFirst ... ");
    // System.out.println(list.getFirst());
    // System.out.println("GetLast ... ");
    // System.out.println(list.getLast());
    // System.out.println("GetAtIndex 0: " + list.getAtIndex(0));
    // System.out.println("GetAtIndex 1: " + list.getAtIndex(1));
    // System.out.println("---");
    // }

    // DoublyLinkedList
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println("AddLast elements: 3, 4, 5, 6, 7");
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("AddFirst elements: 1");
        list.addFirst(1);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("InsertAfterIndex: insert 2 after index 0");
        list.insertAfterIndex(2, 0);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("RemoveFirst ");
        list.removeFirst();
        System.out.println("RemoveLast");
        list.removeLast();
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("RemoveAtIndex: remove element at index 3");
        list.removeAtIndex(3);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("GetFirst");
        System.out.println(list.getFirst());
        System.out.println("GetLast");
        System.out.println(list.getLast());
        System.out.println("---");

        System.out.println("GetAtIndex 0: " + list.getAtIndex(0));
        System.out.println("GetAtIndex 1: " + list.getAtIndex(1));
        System.out.println("GetAtIndex 2: " + list.getAtIndex(2));
        System.out.println("---");
    }
}