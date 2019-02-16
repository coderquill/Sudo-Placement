//https://practice.geeksforgeeks.org/problems/sort-in-specific-order/0/?track=sp-arrays-and-searching

#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
	    int n;
	    cin>>n;
	    int evenArray[n],oddArray[n];
	    int e=0,o=0;
	    int number;
	    for(int i = 0; i<n; i++){
	        cin>>number;
	        if(number%2==0){
	            evenArray[e]=number;
	            e++;
	        }
	        else{
	           oddArray[o]=number;
	            o++;
	        }
	    }   
	    sort(oddArray,oddArray+o, greater<int>());
	    sort(evenArray,evenArray+e);
	    for(int i = 0; i<o; i++){
	        cout<<oddArray[i]<<" ";
	    }
	    for(int i = 0; i<e; i++){
	        cout<<evenArray[i]<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}
