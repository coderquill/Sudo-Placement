//https://practice.geeksforgeeks.org/problems/palindrome-string/0/?track=sp-strings
import java.util.*;
import java.lang.*;
import java.io.*;

class isPalindrome{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t < testCases; t++){
		    int lengthOfString = scan.nextInt();
		    //System.out.println(lengthOfString);
		    
		    String string = scan.next();
		    //System.out.println(string);
		    String reverseString = "";
		    
		    for(int i = string.length()-1; i >= 0; i--){
		        reverseString = reverseString + string.charAt(i);
		    }
		    //System.out.println(reverseString);
		    if(reverseString.equals(string))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		    
		}
	}
}
