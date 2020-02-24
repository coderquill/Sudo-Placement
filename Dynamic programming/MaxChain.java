// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class MaxChain
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Pair pr[] = new Pair[n];
            int arr[] = new int[2*n];
            for(int i = 0; i < 2*n; i++)
            {
               arr[i] = sc.nextInt();
            }
            for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
            {
                pr[j] = new Pair(arr[i], arr[i+1]);
            }
            GfG g = new GfG();
            System.out.println(g.maxChainLength(pr, n));
        }
    }
}
// } Driver Code Ends


/*class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}*/

class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
      if(arr.length==0)
            return 0;
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        Arrays.sort(arr,(a,b)->a.x-b.x);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i].x >arr[j].y){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                       }
            }
        }
        int max=1;
        for(int k=0;k<arr.length;k++){
            max=Math.max(max,dp[k]);
        }
        return max;
       
    }
}
