import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = { 74, 35, 22, 32, 11 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        ob.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}