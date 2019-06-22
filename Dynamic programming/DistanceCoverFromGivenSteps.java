import java.util.*;
class DistanceCoverFromGivenSteps{
	public static int distance(int n){
		int[] dp = new int [n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3; i<=n; i++){
			dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n];
	}

	public static void main(String args[]){
		int n = 4;
		System.out.println(distance(n));
	}
}
