//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
import java.util.*;
class Sort{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
			int n = scan.nextInt();
			int[] array = new int[n];
			for(int i = 0; i<n; i++){
				array[i] = scan.nextInt();
			}
			int low = 0, mid = 0, high=n-1;
			while(mid<=high){
				switch(array[mid]){
					case 0 : {
						 	int temp;
						 	 temp = array[low];
						 	 array[low] = array[mid];
						 	 array[mid] = temp;
						 	 low++;
						 	 mid++;
						 	 break;
						 }
		
					case 1 : mid++;
						break;
					case 2 : {
						 	int temp;
						 	 temp = array[mid];
						 	 array[mid] = array[high];
						 	 array[high] = temp;
						 	 high--;
						 	 break;
						 }
				}
			}
			for(int i = 0; i<n; i++){
				System.out.println(array[i]);
			}
		}
	}
	
	
	
	
}
