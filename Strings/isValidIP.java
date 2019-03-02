//https://practice.geeksforgeeks.org/problems/validate-an-ip-address/1/?track=sp-strings

{
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
public class validip {
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
			String s = sc.next();
			Solution obj = new Solution();
			
			/if(obj.isValidIP(s))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Solution {
	public boolean isValidIP(String s){
	    s = s+'.';
	    String subString = "";
	    boolean answer = true;
	   for( int i = 0; i<s.length(); i++){
	       if(s.charAt(i)!='.' ){
	            subString = subString+s.charAt(i);
	       }
	       else if(s.charAt(i)=='.'){
	           
	           int number = Integer.parseInt(subString);
	           
	           if(subString.length()>=4 || !(number>=0 && number<=255) || !(subString.equals(Integer.toString(number)))){
	               return false;
	           }
	           subString = "";
	           
	       }
	   }
	   
	   return answer;
	}
