import java.util.*;
class Lcs{
	public static int lcs(char[] x, char[] y,int m, int n){
		int[][] L= new int[m+1][n+1];
		for(int i = 0; i<=m ; i++){
			for(int j = 0; j<=n; j++){
				if(i==0 || j == 0)
					L[i][j] = 0;
				else if(x[i-1] == y[j-1])
					L[i][j] = L[i-1][j-1] + 1;
				else
					L[i][j] = max(L[i-1][j], L[i][j-1]);
			}
		}
		return L[m][n];
	}
	public static int max(int a, int b){
		if(a>b)
		return a;
		
		return b;
	}
	
	public static void main(String args[]){
		String a = "AGTXY";
		String b = "AGYYTX";
		int m = a.length();
		int n = b.length();
		System.out.println(lcs(a.toCharArray(), b.toCharArray(), m, n));
	}
	
}
