//https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?track=sp-arrays-and-searching
import java.util.*;
import java.lang.*;
import java.io.*;

class nextSmaller {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t <testCases; t++){
		    
		    int totalElements = scan.nextInt();
		    int [] array = new int[totalElements];
		    
		    for(int i = 0; i<totalElements; i++){
		        array[i] = scan.nextInt();
		    }
		    for(int i = 0; i<totalElements-1; i++){
		        if(array[i]>array[i+1])
		            System.out.print(array[i+1]+" ");
		        else
		            System.out.print("-1 ");
		    }
		    System.out.print("-1");
		    System.out.println();
		}
	}
}
