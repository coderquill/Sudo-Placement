// java program for finding a subsequence with maximum sum
import java.util.*;

class Kadane{
	public static int lis(int[] a, int n){
		int meh= 0, msf = 0;
		for(int i = 0; i<n; i++){
			meh = meh+a[i];
			if(meh<0)
				meh = 0;
			if(msf<meh)
				msf = meh;
		}
		return msf;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] array = {8,2,-7,6,-2};
		System.out.println(lis(array,array.length));
		
	}
}
