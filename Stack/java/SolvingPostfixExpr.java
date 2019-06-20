//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression/0/?track=sp-stack&batchId=122

import java.util.*;
import java.lang.*;
import java.io.*;

class SolvingPostfixExpr {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases;  t++){
		    String str = scan.next();
		    int result = 0;
		    Stack<Integer> stack = new Stack<Integer>();
		    for(int i=0;i<str.length();i++){
		        if(Character.isLetterOrDigit(str.charAt(i))){
		            stack.push(str.charAt(i)-'0');
		        }
		        else{
		            int a = stack.pop();
		            int b = stack.pop();
		            result = op(b,a, str.charAt(i));
		            stack.push(result);
		        }
		    }
		    System.out.println(stack.pop());
		}
	}
	public static int op(int a, int b, char c){
	    if(c == '+')
	        return a+b;
	   else if( c == '-')
	    return a-b;
	    else if( c == '*')
	    return a*b;
	    else if(c =='/')
	    return a/b;
	    return -1;
	}
}
