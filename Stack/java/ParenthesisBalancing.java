//https://practice.geeksforgeeks.org/problems/parenthesis-checker/0/?track=sp-stack

import java.util.*;
import java.lang.*;
import java.io.*;

class ParenthesisBalancing {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t = 0; t<testCases; t++){
		    String str = scan.next();
		    int flag = 1;
		    Stack<Character> stack = new Stack<Character>();
		    for(int i = 0; i<str.length(); i++){
		        if( (str.charAt(i) == '{')|| (str.charAt(i) == '[')||(str.charAt(i) == '(') ){
		            stack.push(str.charAt(i));
		        }
		        else if(!stack.empty() && ( (str.charAt(i)=='}' && stack.peek() == '{') ||
		                                    (str.charAt(i)==')' && stack.peek() == '(') ||
		                                    (str.charAt(i)==']' && stack.peek() == '[') ) ){
		                                        stack.pop();
		        }
		        else
		            flag = 0;
		        
		    }
		    if(stack.empty() && flag==1)
		        System.out.println("balanced");
		    else
		        System.out.println("not balanced");
		}
	}
}
