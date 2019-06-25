import java.util.*;
class Knapsack{
	public static int strategy(int[] val, int[] weight, int n, int W){
		int[][] k = new int[n+1][W+1];
		for(int i = 0; i<=n; i++){
			for(int w = 0; w<=W; w++){
				if(i == 0 || w == 0)
					k[i][w] = 0;
				else if(weight[i-1]<=w)
					k[i][w] = 
					Math.max(val[i-1]+k[i-1][w-weight[i-1]], k[i-1][w]);
				else
					k[i][w] = k[i-1][w];
			}
		}
		return k[n][W];
	}
	public static void main(String args[]) 
    { 
        int val[] = new int[]{60, 100, 120}; 
    int wt[] = new int[]{10, 20, 30}; 
    int  W = 50; 
    int n = val.length; 
    System.out.println(strategy(val,wt,n,W)); 
    } 
}
