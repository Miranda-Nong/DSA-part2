public class reverseArray {
    public static void reverse(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end++;
        }
    }
    public static void printArray(int arr[], int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printArray(arr, 6);
        reverse(arr, 0, 5);
        System.out.println("Reversed Array is: ");
        printArray(arr, 6);
    }
    

}
