import java.util.Arrays;

public class Problem3 {
    static int KthMin(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,-1};
        int x = KthMin(arr, 3);
        System.out.println(x);
        
    }
}
