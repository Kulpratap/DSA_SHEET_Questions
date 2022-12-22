public class Problem10{
	static int minjumps(int arr[]){
		int n=arr.length;
		if(n<=1){
			return 0;
		}
		if(arr[0]==0)
		return -1;
		int maxreach=arr[0];
		int steps=arr[0];
		int jump=1;
		for(int i=1;i<n;i++){
			if(i==n-1){
				return jump;
			}
			maxreach=Math.max(maxreach, i+arr[i]);
			steps--;
			if(steps==0){
				jump++;
				if(i>=maxreach)
				return -1;

				steps=maxreach-i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,3,1,1,4,1,1,2};
		int x = minjumps(arr);
		System.out.println(x);
	}
}