//https://practice.geeksforgeeks.org/problems/merge-k-sorted-arrays/1

// { Driver Code Starts
import java.util.*;
class MergeKSortedArrays{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			GfG g = new GfG();
			ArrayList<Integer> arr= g.mergeKArrays(a, n);
			printArray(arr,n*n);
		}
	}
	public static void printArray(ArrayList<Integer> arr, int size){
		for(int i = 0; i < size ; i++)
			System.out.print(arr.get(i)+" ");
		System.out.println();
	}
}// } Driver Code Ends
/*Complete the function below*/
class GfG
     {
         static void mergeSort(int a[],int l, int r){
             if(l<r){
                 int middle = (l+r)/2;
                 mergeSort(a, l,middle);
                 mergeSort(a,middle+1, r);
                 merge(a, l, middle, r);
             }
             
         }
         static void merge(int a[],int l, int m, int r){
             int n1 = m+1-l;
             int n2 = r-m;
             //ArrayList<Integer> sortedList = new ArrayList<Integer>();
             int[] left = new int[n1];
             int[] right = new int[n2];
             for(int i=0;i<n1;i++)
                left[i] = a[l+i];
                
             for(int i=0;i<n2;i++)
                right[i] = a[m+1+i]; 
                
             int i=0, j=0,k=l;
             while(i<n1&&j<n2){
                 if(left[i]<=right[j]){
                     a[k] = left[i];
                     i++;
                     k++;
                 }
                 else{
                     a[k] = right[j];
                     j++;
                     k++;
                 }
             }
             while(i<n1){
                 a[k] = left[i];
                     i++;
                     k++;
             }
             while(j<n2){
                 a[k] = right[j];
                     j++;
                     k++;
             }
             
         }
        public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
          {
           //add code here.
           ArrayList<Integer> a = new ArrayList<Integer>();
           int[] toArray = new int[k*k];
           int p=0;
           for(int i=0; i<k; i++){
               for(int j = 0; j<k; j++){
                   toArray[p] = arrays[i][j];
                   p++;
               }
           }
           mergeSort(toArray, 0, (k*k)-1);
           for(int i=0;i<k*k;i++){
               a.add(toArray[i]);
           }
           
           return a;
          }
}
