class Problem1
{
    static void Reverse(int arr[], int l , int h){
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
    public static void main(String[] args) {
        int arr[]={20,10,30,67};
        System.out.println("Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Reverse(arr, 0, arr.length-1);
        System.out.println("\nReversed Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}