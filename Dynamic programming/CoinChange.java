//https://practice.geeksforgeeks.org/problems/coin-change/0/?track=sp-dynamic-programming&batchId=122

import java.util.*;
import java.lang.*;
import java.io.*;

class CoinChange {
	public static void main (String[] args) {
		Scanner scan  = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
		    int n = scan.nextInt();
		    int[] coinArray = new int[n];
		    
		    
		    for(int i = 0; i<n ; i++){
		        coinArray[i] = scan.nextInt();
		    }
		    Arrays.sort(coinArray);
		    /*for(int i = 0; i<n ; i++){
		       System.out.print(coinArray[i]+" ");
		    }
		    System.out.println();*/
		    int k = 0;
		    int sum = scan.nextInt();
		    int[][] matrix = new int[n][sum];
		    for(int i = 0; i<n; i++){
		        for(int j = 0; j<sum; j++){
		            if(i == 0){
		                if((j+1)%coinArray[0] == 0){
		                    matrix[i][j] = 1;
		                }
		            }
		            else if(coinArray[i]-2>=j)
		                matrix[i][j] = matrix[i-1][j];
		           else if(coinArray[i]-1 == j)
		                matrix[i][j] = matrix[i-1][j]+1;
		            else
		            matrix[i][j] = matrix[i-1][j]+matrix[i][j -coinArray[i]];
		            //System.out.print(matrix[i][j]+" ");
		        }
		        //System.out.println();
		    }
		    System.out.println(matrix[n-1][sum-1]);
		    
		}
	}
}
