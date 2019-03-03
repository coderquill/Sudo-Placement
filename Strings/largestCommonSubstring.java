//https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0/?track=sp-strings

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String isPalindrome(String s){
        String reverseString = "";
        for(int i = s.length()-1; i>=0; i--){
            reverseString = reverseString + s.charAt(i);
        }
        
        if(reverseString.equals(s)){
            //System.out.println(s);
            //return s.length();
            return s;
        }
        else
            return "NO";
        
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
		    String string = scan.next();
		    int length = string.length();
		    String reverseString = "";
		    String[] stringArray = new String[100000];
		    //stringArray = "";
		    String flag = "";
		    String answer = "";
		    /*for(int i = length-1; i>=0; i--){
		        reverseString = reverseString + string.charAt(i);
		    }
		    System.out.println(reverseString);*/
		    String subString = ""; 
		    //String reverseString = "";
		    int k = 0;
		    for(int i =0; i<length-1; i++){
		        subString = subString + string.charAt(i);
		        
		        
		        for( int j = i+1; j<length; j++){
		            subString = subString + string.charAt(j);
		            
		            //System.out.println(subString);
		            answer = isPalindrome(subString);
		            if(answer!="NO"){
		                stringArray[k]=answer;
		                k++;
		            }
		         
		        }
		        subString = ""; 
		        reverseString = "";
		    }
		    /*for(int i = 0; i<k; i++){
		      System.out.println(stringArray[i]);  
		    }*/
		    flag = stringArray[0];
		    
		    for(int i = 0; i<k; i++){
		        if(flag.length() < stringArray[i].length())
		            flag = stringArray[i];
		    }
		    if(flag == null)
		        System.out.println(string.charAt(0));
		    else
		        System.out.println(flag);
		}
	}
}
