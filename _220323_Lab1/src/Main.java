import implementations.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        System.out.println("AddLast elements: 2, 3, 4");
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("AddFirst elements: 1");
        list.addFirst(1);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("RemoveFirst ... ");
        System.out.println("RemoveLast ... ");
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("AddAtIndex elements: At index 2, add 7");
        list.addAtIndex(7, 2);
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("RemoveAtIndex 2 ... ");
        System.out.println("List size: " + list.size());
        System.out.println(list.toString());
        System.out.println("---");

        System.out.println("GetFirst ... ");
        System.out.println(list.getFirst());
        System.out.println("GetLast ... ");
        System.out.println(list.getLast());
        System.out.println("GetAtIndex 0: " + list.getAtIndex(0));
        System.out.println("GetAtIndex 1: " + list.getAtIndex(1));
        System.out.println("---");
    }
}