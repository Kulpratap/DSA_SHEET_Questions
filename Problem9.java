
import java.util.Arrays;

class Problem9 {
   static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int res=0;
        int res1=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>k){
            arr[i]=arr[i]-k;
        }
        else if(arr[i]<k){
            arr[i]=arr[i]+k;
        }
        
        }
        
        for(int i=1;i<arr.length;i++){
            if (arr[res]<arr[i]){
                res=i;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[res1]>arr[i]){
                res1=i;
            }
        }
        return arr[res]-arr[res1];
    }
    public static void main(String[] args) {
        int arr[]={2 ,6 ,3, 4, 7, 2, 10, 3, 2, 1};
        int x = getMinDiff(arr, arr.length,5);
        System.out.println(x);
    }
}
