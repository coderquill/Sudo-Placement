//https://practice.geeksforgeeks.org/problems/binary-array-sorting/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryArray {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t=0; t<testCases; t++){
		    int n = scan.nextInt();
		    int[] a = new int[n];
		    
		    //int noOf0s = 0;
		    for(int i=0; i<n; i++){
		        a[i] = scan.nextInt();
		      //  if(a[i] == 0)
		        //    noOf0s++;
		    }
		    /* noOf1s = n - noOf0s;
		    //System.out.println(noOf0s+" "+noOf1s);
		    for(int i = 0; i<noOf0s; i++)
		        a[i] = 0;
		    for(int i = noOf0s; i<n; i++)
		        a[i] = 1;
		    for(int i=0; i<n; i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();*/
		    
		    
		/*two index approach:*/
		int left = 0, right = n-1;
		    while(left<right){
		        while(a[left] == 0 && left<right){
		            left++;
		        }
		         while(a[right] == 1 && left<right){
		            right--;
		         }
		        if(left<right){
		            a[left] = 0;
		             a[right] = 1;
		            left++;
		            right--;
		        }
		    }
		    for(int i=0; i<n; i++){
		        System.out.print(a[i]+" ");
		    }
		     
		    System.out.println();
		}
		
	}
}
