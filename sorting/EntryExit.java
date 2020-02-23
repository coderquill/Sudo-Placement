/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class EntryExit {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t=0; t<testCases; t++){
		    int n = scan.nextInt();
		    int[] start = new int[n];
		    int[] end = new int[n];
		    int[] a = new int[10000];
		    for(int i=0; i<n; i++){
		        start[i] = scan.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        end[i] = scan.nextInt();
		    }
		    for(int i=0; i<n; i++){
		        for(int j = start[i]; j<=end[i]; j++){
		            a[j]++;
		        }
		    }
		    int max = a[0];
		    int k = 0;
		    for(int i = 1; i<a.length; i++){
		        if(max<a[i]){
		            max = a[i];
		            k = i;
		        }
		    }
		    System.out.println(max+" "+k);
		    
		    
		}
	}
}
