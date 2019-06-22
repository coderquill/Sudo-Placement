import java.util.*;
import java.lang.Math;
class Lis{
	public static int lis(int[] a, int n){
		int[] p = new int[n];
		for(int i = 0; i<n; i++){
			System.out.println(a[i]);
		}
		for(int i = 0; i<n; i++){
			p[i] = 1;
		}
		for(int i = 1; i<n; i++){
			for(int j=0; j<i; j++){
				if(a[j]<a[i])
					p[i] = Math.max(p[j]+1, p[i]);
			}
		}
		int max = p[0];
		for(int i = 0; i<n; i++){
			if(p[i]>max)
				max = p[i];

		}
		return max;
	}
	public static void main(String args[]){
		int[] arr = {10, 22, 33, 21, 50, 9};
		System.out.println(lis(arr, arr.length));
	
	}
}
