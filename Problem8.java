public class Problem8 {
    static int LargestSum(int arr[]){
        int res=arr[0];
        int maxending=arr[0];
        for(int i=1;i<arr.length;i++){
            maxending=Math.max(maxending+arr[i], arr[i]);
            res=Math.max(maxending, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-5,6,7,8,-6};
        int x = LargestSum(arr);
        System.out.println(x);
    }
}
