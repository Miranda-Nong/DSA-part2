import java.util.Scanner;

public class deletion {
    public static int findElement(int arr[], int arr_size, int key) {
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int deleteElement(int arr[], int arr_size, int key) {
        int pos = findElement(arr, arr_size, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return arr_size;
        }
        // Shift elements to the left to fill the gap
        for (int i = pos; i < arr_size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr_size - 1; // Return the new size of the array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        System.out.println("Enter the unsorted elements of the array");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be deleted");
        int key = sc.nextInt();

        System.out.print("Before deletion: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        arr_size = deleteElement(arr, arr_size, key);

        System.out.print("\nAfter deletion: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
