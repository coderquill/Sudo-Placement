//https://practice.geeksforgeeks.org/problems/longest-common-substring/0/?track=sp-strings

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in); 
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++ ){
		    int m = scan.nextInt();
		    int n = scan.nextInt();
		    String string1 =  scan.next();
		    String string2 =  scan.next();
		    String[] string1Array = new String[100000];
		    String[] string2Array = new String[100000];
		    String[] commonSubString = new String[100000];
		    String subString1 = "";
		    String subString2 = "";
		    int k = 0;
		    for(int i = 0; i<=m-1; i++){
		        subString1 = subString1 + string1.charAt(i);
		        string1Array[k] = subString1;
		        k++;
		        for(int j = i+1; j<m; j++){
		            subString1 = subString1 + string1.charAt(j);
		            string1Array[k] = subString1;
		            k++;
		        }
		        subString1 = "";
		    }
		    /*for(int i = 0; i<k; i++){
		        System.out.println(string1Array[i]);
		        
		    }*/
		    int l = 0;
		    for(int i = 0; i<=n-1; i++){
		        subString2 = subString2 + string2.charAt(i);
		        string2Array[l] = subString2;
		        l++;
		        for(int j = i+1; j<n; j++){
		            subString2 = subString2 + string2.charAt(j);
		            string2Array[l] = subString2;
		            l++;
		        }
		        subString2 = "";
		    }
		   /* for(int i = 0; i<l; i++){
		        System.out.println(string2Array[i]);
		        
		    }*/
		    int a = 0;
		    for(int i = 0; i<k; i++){
		       // System.out.println(string1Array[i]);
		        for(int j = 0; j<l; j++){
		            if(string1Array[i].equals(string2Array[j])){
		                 //System.out.println(string2Array[j]);
		                 commonSubString[a] = string2Array[j];
		                 a++;
		             }
		        }
		    }
		    String answer = commonSubString[0];
		    for(int  i = 1; i<a; i++){
		        
		            if(answer.length() < commonSubString[i].length()){
		                answer = commonSubString[i];
		            }
		    }
		    
		    System.out.println(answer);
		    
		}
	}
}
