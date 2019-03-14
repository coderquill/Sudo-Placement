//https://practice.geeksforgeeks.org/problems/binary-representation/0/?track=sp-bit-magic&batchId=105

import java.util.*;
import java.lang.*;
import java.io.*;

class binaryRepresentation {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int i = 0; i<testCases; i++){
	        int number = scan.nextInt();
	        
	        int[] array = new int[14];
	        
		int k = 13;
		    
		while(number!=1){
		     array[k] = number%2;
       	             number = number/2;
		     k--;
		}
		    
		array[k] = 1;
		    
		for(int j = 0; j<14; j++){
	            System.out.print(array[j]);
	        }
	        
	        System.out.println();
	    }
		    
	}
}
