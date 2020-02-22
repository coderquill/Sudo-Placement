/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class KthMinimum {
	public static void main (String[] args) {
		int testCases;
		Scanner scan = new Scanner(System.in);
		testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
			int n = scan.nextInt();
			
			//int[] a = new int[n];
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int i = 0; i<n; i++){
			    //a[i] = scan.nextInt();
			    pq.add(scan.nextInt());
			}
			int k = scan.nextInt();
			for(int i = 0; i<k-1; i++){
			    pq.poll();
			}
			System.out.println(pq.peek());
		}
	}
}
