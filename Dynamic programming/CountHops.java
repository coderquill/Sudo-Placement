//https://practice.geeksforgeeks.org/problems/count-number-of-hops/0/?track=sp-dynamic-programming&batchId=122

import java.util.*;
import java.lang.*;
import java.io.*;

class CountHops {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t=0; t<testCases; t++){
		    int n = scan.nextInt();
		    long[] dp = new long[n];
		    if(n == 1)
		        System.out.println("1");
		    else if(n == 2){
		        System.out.println("2");
		    }
		    else if(n == 3){
		        System.out.println(4);
		    }
		    else{
		        dp[0] = 1;
		        dp[1] = 2;
		        dp[2] = 4;
		        
		        for(int i = 3; i<n; i++){
		            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		        }
		    
		        System.out.println(dp[n-1]);
		    }

		}
	}
}
