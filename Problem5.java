import java.util.Arrays;

public class Problem5 {
    static void moveallnegativeelement(int arr[]){
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int arr[]={-10,20,-40,-50};
        moveallnegativeelement(arr);    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
