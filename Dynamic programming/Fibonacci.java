//https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers/0/?track=sp-dynamic-programming&batchId=122

import java.util.*;
import java.lang.*;
import java.io.*;

class Fibonacci {
	public static void main (String[] args) {
		long[] array = new long[85];
		array[0]=1;
		array[1]=1;
		for(int i = 2; i<85; i++){
		    array[i] = array[i-1]+array[i-2];
		}
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    int n = scan.nextInt();
		    for(int j = 0; j<n; j++){
		        System.out.print(array[j]+" ");
		    }
		    System.out.println();
		}
	}
}
