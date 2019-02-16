//https://practice.geeksforgeeks.org/problems/print-an-array-in-pendulum-arrangement/0/?track=sp-arrays-and-searching

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void printing(int array[],int limit){
    int i = 0;
	int j = limit-1;
	int answer[limit];
	   for(int k = 0; k<limit; k++){
	       if(k%2==0){
	           answer[i] = array[k];
	           i++;
	       }else{
	           answer[j] = array[k];
	           j--;
	       }
	   }
	   for(int k = 0; k<limit; k++){
	       cout<<answer[k]<<" ";
	   }
	   
}
int main() {
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
	    int array[100];
	    int answer[100];
	    int limit;
	    cin>>limit;
	    for(int i = 0; i<limit; i++){
	        cin>>array[i];
	    }
	    sort(array,array+limit,greater<int>());
	    if(limit%2!=0){
	        printing(array,limit);
	        cout<<endl;
	        /*int i = 0;
	        int j = limit-1;
	        for(int k = 0; k<limit; k++){
	            if(k%2==0){
	                answer[i] = array[k];
	                i++;
	            }else{
	                answer[j] = array[k-1];
	                j--;
	            }*/
	    }else{
	        //int newLimit = limit-1;
	        int newArray[limit-1];
	        int j = 1;
	        for(int i = 0; i<limit-1; i++ ){
	            newArray[i] = array[j];
	            j++;
	        }
	        printing(newArray,limit-1);
	        cout<<array[0]<<endl;
	        
	    }
	    
	   
	    
	}
	return 0;
}
