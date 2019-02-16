//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1/?track=sp-arrays-and-searching
#include <bits/stdc++.h>
using namespace std;
void countDistinct(int [], int , int );
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		
		int n,k;
		cin>>n>>k;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		countDistinct(a,k,n);cout<<endl;
	}
	return 0;
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below method */
void countDistinct(int A[], int k, int n)
{
    
    //int count[101]= {0};
    //while((i+k-1)<n){
    for(int i = 0; i+k-1<n; i++){
        int count[101] = {0};
        //int number = A[i];
        for(int j =i; j<i+k; j++ ){
            count[A[j]]++;
        }
        int answer = 0;
        for(int j = 1; j<101; j++){
            //answer = answer + count[j];
            //cout<<answer<<" ";
            if(count[j]!=0)
                answer++;
                //cout<<count[j]<<" ";
        }
        cout<<answer<<" ";
    }
    
}
