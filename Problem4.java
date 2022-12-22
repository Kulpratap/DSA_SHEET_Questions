public class Problem4 {
    static void sort123(int arr[]){
        int count1 =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                arr[count1]=arr[i];
                count1++;
            }
        }
        while(count1 <arr.length){
            arr[count1++]=1;
        }
        // move 2 to last
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=2){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count <arr.length){
            arr[count++]=2;
        }
        

    }
    public static void main(String[] args) {
        int arr[]={0,0,1,2,1,0};
        sort123(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
