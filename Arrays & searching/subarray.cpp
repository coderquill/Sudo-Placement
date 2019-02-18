https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?track=sp-arrays-and-searching

#include<iostream>
using namespace std;
int main()
 {
	//code
	int testCases,n,s,sum,start,end,flag;
	cin>>testCases;
	while(testCases--)
	{
	     
	    cin>>n>>s;
	    int a[n];
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	        sum=0;
	     flag=0;
	   start=0, end=0;
	    while(end<n){
	        sum+=a[end];
	        if(sum>s){
	            start++;
	            end=start;
	            sum=0;
	        }
	        else if(sum==s){
	            flag=1;
	            break;
	        }
	        else
	        end++;
	    }
	    if(flag==1)
	    cout<<start+1<<" "<<end+1<<endl;
	    else
	    cout<<-1<<endl;
	}
	return 0;
}
