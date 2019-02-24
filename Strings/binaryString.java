//https://practice.geeksforgeeks.org/problems/binary-string/0/?track=sp-strings

import java.util.*;
import java.lang.*;
import java.io.*;

class binaryString {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int t = 0; t<testCases; t++){
	    	int n = scan.nextInt();;
	    	String str = scan.next();
	
	    	int count =0 ;
	    
	    	//count no of 1's in string 
	    	for(int i=0;i<n;i++){
	      		if(str.charAt(i) == '1') 
	        		count++; 
	    	}

	    	//calcualte nC2 where n is the no of 1's in string 
	    	int answer = (count*(count-1))/2 ;
	    	System.out.println(answer);
	    }
	}
}

