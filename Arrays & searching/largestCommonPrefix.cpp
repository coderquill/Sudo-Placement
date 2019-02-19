//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array/0/?track=sp-arrays-and-searching

#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t,i;
	scanf("%d",&t);
	while(t--)
	{
	    int n;
	    scanf("%d",&n);
	    string a[n],s;
	    int min=INT_MAX;
	    for(i=0;i<n;i++)
	    {
	    	string s;
	        cin>>s;
	        a[i]=s;
	        if(min>s.size())
	        min=s.size();
	    }
	    //printf("%d\n",min);
	    int j,f=0;
	    for(j=0;j<min;j++)
	    {
	    	for(i=0;i<n;i++){
			
		    	if(i<n-1)
		    	{
		    		if(a[i][j]==a[i+1][j])
		    		{
		    			
					}
					else
					{
						f=1;
						break;
					}
				}
				
			}
			if(f==1)
			{
			if(j==0)
			printf("-1");
				for(i=0;i<j;i++)
				printf("%c",a[0][i]);
				break;
			}
		}
	    if(f==0)
	    {
	    	cout<<a[0];
		}
	    printf("\n");
	}
	return 0;
}
