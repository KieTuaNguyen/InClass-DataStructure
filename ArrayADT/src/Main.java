public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Kiet!");
        Array arr = new Array(5);

        arr.set(0, 10);
        arr.set(1, 20);
        arr.set(2, 30);
        arr.set(3, 40);
        arr.set(4, 50);
        arr.traverse();
        System.out.println("---");

        System.out.println("Element at index 3: " + arr.get(3));
        System.out.println("Element at index 4: " + arr.get(4));
        System.out.println("---");

        System.out.println("Index of value 30: " + arr.indexOf(30));
        System.out.println("---");

        arr.insert(2, 25);
        arr.remove(4);
        arr.traverse();

    }
}