//https://practice.geeksforgeeks.org/problems/reversing-the-vowels/0/?track=sp-strings

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseOnlyVovels {
	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
		    String string = scan.next();
		    Stack stack = new Stack();
		    for(int i = 0; i<string.length(); i++){
		        if(string.charAt(i) == 'a' || string.charAt(i) == 'e' ||
		        string.charAt(i) == 'i' || string.charAt(i) == 'o' || 
		        string.charAt(i) == 'u' )
		        stack.push(string.charAt(i));
		    }
		    
		    while(!stack.empty()){
		        //System.out.println(stack.pop());
		        for(int i = 0; i<string.length(); i++){
		           if(string.charAt(i) == 'a' || string.charAt(i) == 'e' ||
		                string.charAt(i) == 'i' || string.charAt(i) == 'o' || 
		                string.charAt(i) == 'u'){
		                System.out.print(stack.pop());
		            }
		            else
		                System.out.print(string.charAt(i));
		        }
		    }
		        
		    System.out.println();
		    
		}
		    
	}
}
