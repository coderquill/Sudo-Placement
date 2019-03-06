//https://practice.geeksforgeeks.org/problems/lazy-pasha/0/?track=sp-strings

import java.util.*;
import java.lang.*;
import java.io.*;

class lazyPasha {
    public static String rotate(String string, int query){
        int length = string.length();
        int i,j;
        if(query>=length)
            query = query % length;
        String rotatedString ="";
        
        for( i = 0; i<length; i++){
             j = (i + length - query)%length;
             rotatedString = rotatedString + string.charAt(j)  ;
        }
        
        
        return rotatedString;
        
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
		    int length = scan.nextInt();
		    int totalQueries = scan.nextInt();
		    String string= scan.next();
		    String rotatedString = "";
		    int type = 0;
		    int query = 0;
		    for(int i = 0; i<totalQueries; i++){
		        type = scan.nextInt();
		        query = scan.nextInt();
		        if(type == 1){
		           rotatedString = rotate(string,query); 
		           string = rotatedString;
		        }
		        else if(type == 2){
		            System.out.println(string.charAt(query));
		        }
		    }
		}
	}
}
