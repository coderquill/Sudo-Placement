//https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0/?track=sp-arrays-and-searching

#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	//cout<<testCases;
    
	for(int t = 0; t<testCases; t++){
	        long long limit;
	    	cin>>limit;
	    	long long array[limit];
	        //cout<<limit;
	        int count = 0;
	        long long max = INT_MIN;
	        long long answer[limit];
	        for(long long i = 0; i<limit; i++){
	            cin>>array[i];  
	            //cout<<array[i]; 
	        }
	
	        for(long long i = limit-1; i>=0; i--){
	            if(array[i]>=max){
	                max = array[i];
	                answer[count] = array[i];
	                count++;
	            }
	        }
	        for(long long i = count-1; i>=0; i--){
	            cout<<answer[i]<<" ";
	        }
	        cout<<endl;
	}
	return 0;
}
