//https://practice.geeksforgeeks.org/problems/find-first-set-bit/0/?track=sp-bit-magic&batchId=105

import java.util.*;
import java.lang.*;
import java.io.*;

class firstSetBit {
    public static int getFirstSetBitPos(int n) 
    { 
        return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1; 
    } 
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int i = 0; i<testCases; i++){
	        int number = scan.nextInt();
	        if(number == 0 )
	            System.out.println("0");
	        else{
	       /* int bit;
	        int j = 0;
	        while(number!=1){
		        bit = number%2;
		        number = number/2;
		        j++;
		        if(bit == 1){
		            System.out.println(j);
		            break;
		        }
	        }*/
	            System.out.println(getFirstSetBitPos(number));
	        }
	    }
		     
	}
}
