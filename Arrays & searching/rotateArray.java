//https://practice.geeksforgeeks.org/problems/reversal-algorithm/0/?track=sp-arrays-and-searching

import java.util.*;
import java.lang.*;
import java.io.*;

class rotateArray {
	public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int testCases = scan.nextInt();
    	for(int t = 0; t<testCases; t++){
    	   int lengthOfArray = scan.nextInt();
    	   
    	   int[] array = new int[lengthOfArray];
    	   int[] finalArray = new int[lengthOfArray];
    	   
    	   for(int i = 0; i<lengthOfArray; i++){
    	       array[i] = scan.nextInt();
    	   }
    	   int toRotate = scan.nextInt();
    	   if(toRotate>lengthOfArray)
    	        toRotate = toRotate%lengthOfArray;
    	        
    	   for(int i = 0; i<lengthOfArray; i++){
    	       finalArray[i] = array[(i+toRotate)%lengthOfArray];
    	       System.out.print(finalArray[i]+" ");
    	   }
    	   System.out.println();
    	}
	}
}
