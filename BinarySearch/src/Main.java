public class Main {

    public static int BinarySearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return BinarySearch(arr, key, start, mid - 1);
        } else {
            return BinarySearch(arr, key, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        int start = 0;
        int end = arr.length - 1;
        int result = BinarySearch(arr, key, start, end);
        System.out.println(result);
    }
}