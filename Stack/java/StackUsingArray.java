//https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1/?track=sp-stack&batchId=122#ExpectOP
{
import java.util.*;
class StackUsingArray {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyStack obj = new MyStack();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/* You need to add code for functions 
   push() and pop() */
class MyStack{
    int top;
	int arr[] = new int[1000];
    MyStack()
	{
		top = -1;
	}
	
	/* The method push to push element
	    into the stack */
    void push(int a)
	{
	    arr[++top] = a;
	} 
	
    /* The method pop which return 
      the element poped out of the stack*/
	int pop()
	{
        if(top == -1)
            return -1;
        else
            return arr[top--];
	}
}

