    class Problem7{
        static void circular(int arr[]){
            int n = arr.length;
            int x = arr[n-1];
            for(int i=arr.length-1;i>=1;i--){
                arr[i]=arr[i-1];
            }
           arr[0]=x;
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            circular(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }