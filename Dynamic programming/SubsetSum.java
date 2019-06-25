import java.util.*;
class SubsetSum{
	public static int isSum(int[] a, int n, int k){
		int sum = 0;
		for(int i = 0; i<n; i++)
			sum = sum+a[i];
		int[] m = new int[sum+10];
		for(int i = 0; i<sum+10; i++){
			m[i] = 0;
		}
		m[0] = 1;
		for(int i = 0; i<n; i++){
			for(int j = sum; j>=a[i]; j--){
				m[j] |=m[j-a[i]];
			}
		}
		return m[k];
	}
	
	public static void main(String args[]){
		int set[] = {3, 34, 4, 12, 5, 2}; 
        int sum = 9; 
        int n = set.length; 
        if (isSum(set, n, sum)!=0) 
            System.out.println("Found a subset"
                          + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
   	 } 
	
}

