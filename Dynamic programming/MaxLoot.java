//https://practice.geeksforgeeks.org/problems/stickler-theif/0

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxLoot {
	public static void main (String[] args) {
		//code
	    Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
			int n =scan.nextInt();	
			int a[] = new int[n];
			
			for(int i = 0; i<n; i++)
			    a[i] = scan.nextInt();
			if(n==1)
			   System.out.println(a[0]);
			else if(n==2)
			    System.out.println(Math.max(a[0],a[1]));
			else{
			int dp[] = new int[n];
                dp[0] = a[0];
                dp[1] = Math.max(a[0] , a[1]);
            int test1;
            int test2;
            for(int i = 2 ; i < n ; i++){
                test1 = a[i] + dp[i-2]; // A[i]is included
                test2 = dp[i-1]; //A[i] is not included
                dp[i] = Math.max(test1 , test2);
            }
            System.out.println(dp[n-1]);}
		}
	}
}
