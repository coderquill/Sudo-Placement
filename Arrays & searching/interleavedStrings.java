//https://practice.geeksforgeeks.org/problems/interleaved-strings/1/?track=sp-strings

{
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            GfG g=new GfG();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}

}


/*you are required to complete this method */
class interleavedStrings{
	public boolean isInterLeave(String a,String b,String c)
	{
           if(a.length()+b.length()!=c.length())
	            return false;
	       
	        int k=0;
	    
	        boolean solFound = false;
	        Queue<Integer> sol = new LinkedList<Integer>();
	        sol.add(0);
	        sol.add(0);
	    
	        int i,j;
	        while(!sol.isEmpty()){
	            i = sol.remove();
	            j = sol.remove();
	        
	        if(i==a.length() && j==b.length()){
	            solFound = true;
	            break;
	        }
	        
	        if(i<a.length() && a.charAt(i)==c.charAt(i+j)){
	            sol.add(i+1);sol.add(j);
	        }
	        if(j<b.length() && b.charAt(j)==c.charAt(i+j)){
	            sol.add(i);sol.add(j+1);
	        }
	    }
	    return solFound;
	}
}
