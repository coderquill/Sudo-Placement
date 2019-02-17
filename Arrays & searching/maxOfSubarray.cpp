//https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0/?track=sp-arrays-and-searching
#include <iostream>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
	    int n,k;
	    cin>>n>>k;
	    int array[n];
	    for(int i = 0; i<n; i++){
	        cin>>array[i];
	    }
	    for(int i=0; i+k-1<n; i++){
	        int max = array[i];
	        for(int j = i+1; j<i+k; j++){
	            if(array[j]>max)
	                max = array [j];
	                //cout<<"i"<<i<<"j"<<j<<"max"<<max<<endl;
	        }
	        cout<<max<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}s
