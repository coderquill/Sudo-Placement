import java.util.*;
class StringEditDistance{
	public static int min(int a, int b, int c){
		if(a<=b&&a<=c)
			return a;
		if(b<=a&&b<=c)
			return b;
		else 
			return c;

	}
	public static int editDistance(char[] x, char[] y, int m, int n){
		int[][] dp = new int[m+1][n+1];
		for(int i = 0; i<=m; i++){
			for(int j = 0; j<=n; j++){
				if(i==0)
					dp[i][j] = j;
				else if(j ==0)
					dp[i][j] = i;
				else if(x[i-1] == y[j-1])
					dp[i][j] = dp[i-1][j-1];		
				else
					dp[i][j] = 1+min(dp[i-1][j],dp[i-1][j-1],dp[i][j-1]);
			}
		}
		return dp[m][n];
	}
	public static void main(String args[]){
		String x = "sunday";
		String y = "saturday";
		System.out.println(editDistance(x.toCharArray(), y.toCharArray(), x.length(), y.length()));
	}
}
