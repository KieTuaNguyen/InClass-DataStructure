import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(
                "Add a few element to the list: (list.add(10), list.add(11), list.add(12), list.add(13), list.add(14), list.add(15))");
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println("The list is: " + list);

        System.out.println("Add an element at a specific index (list.add(1, 11))");
        list.add(1, 11);
        System.out.println("The list is: " + list);

        System.out.println("Get an element at a specific index (list.get(2))");
        System.out.println("The element at index 2 is: " + list.get(2));

        System.out.println("Set an element at a specific index: (list.set(2, 22))");
        list.set(2, 22);
        System.out.println("The list is: " + list);

        System.out.println("Remove an element at a specific index (list.remove(2))");
        list.remove(2);
        System.out.println("The list is: " + list);

        System.out.println("Get the size of the list (list.size())");
        System.out.println("The size of the list is: " + list.size());

        System.out.println("Get the index of an element (list.indexOf(11))");
        System.out.println("The index of 11 is: " + list.indexOf(11));

        System.out.println("Check if the list contains an element (list.contains(11))");
        System.out.println("The list contains 11: " + list.contains(11));

        System.out.println("Check if the list is empty (list.isEmpty())");
        System.out.println("The list is empty: " + list.isEmpty());

        System.out.println("Remove all elements from the list (list.clear())");
        list.clear();

        System.out.println("Check if the list is empty (list.isEmpty())");
        System.out.println("The list is empty: " + list.isEmpty());
    }
}