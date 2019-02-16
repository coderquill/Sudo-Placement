//https://practice.geeksforgeeks.org/problems/find-the-closest-number/0/?track=sp-arrays-and-searching

#include <iostream>
#include<cstdlib>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
	    int n,k;
	    cin>>n>>k;
	    int array[n];
	    int difference, answer;
	    for(int i = 0; i<n; i++){
	        cin>>array[i];
	    }
	    difference = abs(k-array[0]);
	    answer = array[0];
	    //cout<<difference<<answer;
	   for(int i = 1; i<n; i++){
	       if(difference>abs(k-array[i])){
	            difference = abs(k-array[i]);
	            answer = array[i];
	            //cout<<i<<"="<<difference<<","<<answer<<endl;
	       }
	       else if(difference==abs(k-array[i])){
	            if(answer<array[i])
	                answer = array[i];
	       }
	            
	   }
	   cout<<answer<<endl;
	    
	}
	return 0;
}
