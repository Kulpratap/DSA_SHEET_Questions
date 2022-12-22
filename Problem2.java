public class Problem2 {
    static int max(int arr[]){
        int res=0;
        int res1=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[res]<arr[i]){
                res=i;
            }
        }
        for(int i=1;i<n;i++){
            if(arr[res1]>arr[i]){
                res1=i;
            }
        }
        return (arr[res]+arr[res1]);
    }
    
    public static void main(String[] args) {
        int arr[]={-5,-4,3,0};
        int x = max(arr);
        System.out.println(x);
    }
}
