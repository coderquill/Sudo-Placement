//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0/?track=sp-strings

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseWordsInString {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++ ){
		    String string = scan.next();
		    Stack stack = new Stack();
		    
		    String subString = "";
		    string = string + '.';
		    for(int i = 0; i<string.length(); i++){
		        
		        if(string.charAt(i)!='.'){
		            subString = subString + string.charAt(i);
		            
		        }
		        else if(string.charAt(i)=='.' ){
		            //System.out.println(subString);
		            stack.push(subString);
		            subString = "";
		        }
		        
		        /*else if(string.charAt(i)==string.charAt(string.length()-1)) 
		            System.out.println(subString);*/
		       
		    }
		    
		    while(!stack.empty()){
		           System.out.print(stack.pop());
		           if(!stack.empty())
		            System.out.print(".");
		           else
		            System.out.print(" ");
		           
		       }
		  System.out.println();
		    
		}
	}
}
