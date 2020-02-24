/*package whatever //do not write package name here */

//https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right/0
import java.util.*;
import java.lang.*;
import java.io.*;

class CountPath {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
		    int m =scan.nextInt();
			int n =scan.nextInt();	
			int[][] dp = new int[m][n];
			//Arrays.fill(dp,0);
			for(int i = 0; i<m; i++){
			    dp[i][0] = 1;
			}
			for(int j=0;j<n;j++){
			        dp[0][j]=1;
			}
			for(int i = 1; i<m; i++){
			    for(int j=1;j<n;j++){
			        dp[i][j] = (dp[i][j-1]+dp[i-1][j]) % (int)(Math.pow(10,9)+7);
			    }
			}
			System.out.println(dp[m-1][n-1]);
		}
		
	}
}
