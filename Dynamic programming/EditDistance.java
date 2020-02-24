//https://practice.geeksforgeeks.org/problems/edit-distance/0

import java.util.*;
import java.lang.*;
import java.io.*;

class EditDistance {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
			//int n =scan.nextInt();
			int m = scan.nextInt();
		    int n = scan.nextInt();
		    String s1 = scan.next();
		    String s2 = scan.next();
		    
		    int[][] dp = new int[m+1][n+1];
		   for(int i = 0 ; i<m+1; i++){
		        for(int j = 0; j<n+1; j++){
		            if(i == 0)
		                dp[i][j] = j;
		            else if(j==0)
		                dp[i][j] = i;
		            else if(s1.charAt(i-1) == s2.charAt(j-1))
		                dp[i][j] = dp[i-1][j-1];
		            else
		                dp[i][j] = 1+ Math.min(Math.min(dp[i][j-1], dp[i-1][j]),
		                                    dp[i-1][j-1]);
		        }
		    }
		    System.out.println(dp[m][n]);
		  
		}
	}
}
