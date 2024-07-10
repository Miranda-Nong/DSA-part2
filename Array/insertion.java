
import java.util.*;

public class insertion {
    public static void insertElement(int arr[], int arr_size, int x, int pos) {
        for (int i = arr_size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Enter the size of the array");
        int arr_size = sc.nextInt();
        arr = new int[arr_size + 1];  // Create an array with size+1 to accommodate the new element
        System.out.println("Enter the unsorted elements of the array");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be inserted");
        int x = sc.nextInt();
        System.out.println("Enter the position for insertion");
        int pos = sc.nextInt();
        System.out.print("Before insertion: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        insertElement(arr, arr_size, x, pos);
        arr_size = arr_size + 1;

        System.out.print("\nAfter insertion: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
