
class Problem6 {
	/* Function prints union of arr1[] and arr2[]
	m is the number of elements in arr1[]
	n is the number of elements in arr2[] */
	static int printUnion(int arr1[], int arr2[], int m, int n)
	{
		int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j])
            System.out.print(arr1[i++]+" ");
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j++]+" ");
            }
            else{
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }

        while(i<m){
            System.out.print(arr1[i++]+" ");
        }
        while(j<n){
            System.out.print(arr2[j++]+" ");
        }

		return 0;
	}
    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
       int i=0,j=0;
       while(i<m && j<n){
        if(arr1[i]<arr2[j])
        i++;
        else if(arr2[j]<arr1[i]){
            j++;
        }
        else{
            System.out.print(arr2[j++]+" ");
            i++;
        }
       }
    }

	public static void main(String args[])
	{
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		int m = arr1.length;
		int n = arr2.length;
		printUnion(arr1, arr2, m, n);
        System.out.println();
        printIntersection(arr1, arr2, m, n);
	}
}
