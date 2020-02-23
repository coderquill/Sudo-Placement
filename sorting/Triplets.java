// { Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Triplet g=new Triplet();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}// } Driver Code Ends
/*Complete the function below*/


class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int a[] , int n)
    {
        Arrays.sort(a);
        
    //Your code here
     
        for(int i = 0; i<n-2; i++){
            
            int cursum = 0 - a[i];
            int low = i+1;
            int high = n-1;
            while(low<high){
                if(a[low] + a[high] == cursum)
                    return true;
                else if(a[low]+a[high]>cursum)
                    high--;
                else
                    low++;
            }
            
        }
       return false; 
    }
}
