//https://practice.geeksforgeeks.org/problems/longest-common-increasing-subsequence/0/?track=sp-arrays-and-searching

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int n,i,m,j;
	    cin>>n;
	    int a[n+1];
	    for(i=0;i<n;i++)cin>>a[i];
	    cin>>m;
	    int b[m+1],dp[m+1];
        for(i=0;i<m;i++)cin>>b[i];
	    memset(dp,0,sizeof(dp));
	    for(i=0;i<n;i++)
	    {
	        int tmp=1;
	        for(j=0;j<m;j++)
	        {
	            if(a[i]>b[j])tmp=max(tmp,dp[j]+1);
	            else if(a[i]==b[j])dp[j]=max(dp[j],tmp);
	        }
	    }
	    cout<<*max_element(dp,dp+m)<<endl;
	}
	return 0;
}
