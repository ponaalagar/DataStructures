import java.util.Scanner;
import java.util.ArrayList;

class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 3; 
        int result = binarySearch(arr, k);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (arr[mid] == k) {
                return mid; 
            }
            if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return -1; 
    }
}