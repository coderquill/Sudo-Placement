//https://practice.geeksforgeeks.org/problems/rightmost-different-bit/0/?track=sp-bit-magic&batchId=105
import java.util.*;
import java.lang.*;
import java.io.*;

class rightmostDifferentBit {
    public static void setbit(int x)
     {
         int count=1;
         int i=0;
         while (true)
         {
            
             if ((x&(1<<i))>0){ 
                 System.out.println(count);
                 return;
             } 
             ++i;
             ++count;
         }
     }
     
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-->0)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();
            setbit(n^k);
        }
    }

	
}
