import java.util.*;
class OptimalStrategy{
	public static int strategy(int[] arr, int n){
		int[][] table = new int [n][n];
		int gap,x,y,z, i,j= 0;
		for( gap = 0; gap<n; gap++){
			for(i = 0, j=gap; j<n; i++,j++){
				x = ((i+2)<=j)?table[i+2][j] : 0;
				y = ((i+1)<=(j-1)) ? table[i+1][j-1] :0;
				z = (i<=(j-2)) ? table[i][j-2] : 0;
				table[i][j] = 
				Math.max( (arr[i] + Math.min(x,y)), (arr[j]+Math.min(z,y)) );
			}
		
		}
		return table[0][n-1];

	}
	public static void main(String args[]){
		int arr1[] = { 8, 15, 3, 7 }; 
        int n = arr1.length; 
        System.out.println("" + strategy(arr1, n)); 
  
        int arr2[] = { 2, 2, 2, 2 }; 
        n = arr2.length; 
        System.out.println("" + strategy(arr2, n)); 
  
        int arr3[] = { 20, 30, 2, 2, 2, 10 }; 
        n = arr3.length; 
        System.out.println("" + strategy(arr3, n)); 
	}
}
