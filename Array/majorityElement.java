public class majorityElement {
    public static void findMajority(int arr[], int n){
        int maxcount = 0;
        int index =-1;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count > maxcount){
                maxcount = count;
                index = i;
        }
        }
        if(maxcount > n/2)
            System.out.println(arr[index]);
        else
            System.out.println("No majority index found");

    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,1,3,5,1};
        int n = arr.length;
        findMajority(arr, n);
    }
}
