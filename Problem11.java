import java.util.*;
public class Problem11 {
    static int duplicate(int numRay[]){
        int n=numRay.length;
        Arrays.sort(numRay);
        for(int i=0;i<n-1;i++){
            if(numRay[i]==numRay[i+1])
            return numRay[i];
        }
        return -1;
    }
    static int Duplicate(int nums[]){
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(n<=max){
            return -1;
        }
        int x =duplicate(nums);
    return x;
    }
    public static void main(String[] args) {
        int nums[]={2,5,9,6,9,3,8,9,7,1};
        int x =Duplicate(nums);
        // int y=duplicate(nums);
        System.out.println(x);
        // System.out.println(y);
    }
}
