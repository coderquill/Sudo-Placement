//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0/?track=sp-arrays-and-searching

#include <iostream>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
	    int limit,subLength;
	    cin>>limit>>subLength;
	    int array[limit];
	    for(int i = 0; i<limit; i++)
	        cin>>array[i];
	    int k = subLength-1;
	    int j = subLength-1;  
	    int i = 0;
	    
	    while(j>=i && j<limit){
	        cout<<array[j]<<" ";
	        if(j==i  ){
	           i=k+1;
	           if(i>limit)
	                break;
	           k=k+subLength;
	           if(k>=limit){
	               while(k!=limit)
	               k--;
	           }
	           if(k<limit)
	            j = k+1;
	           else
	            j=k;
	           
	        }
	        j--;
	        
	    }
	    
	    
	}
	return 0;
}
