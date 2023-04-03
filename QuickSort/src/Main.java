import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 74, 35, 22, 11, 32, 37 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        System.out.println("---");
        System.out.print("Sorted array: ");
        QuickSort.quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}