//https://practice.geeksforgeeks.org/problems/find-the-fine/0/?track=sp-arrays-and-searching
#include <iostream>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
	    int n,date;
	    cin>>n>>date;
	    int carNumber[n], penalty[n];
	    int answer = 0;
	    for(int i = 0; i<n; i++){
	        cin>>carNumber[i];
	    }
	    for(int i = 0; i<n; i++){
	        cin>>penalty[i];
	    }
	    if(date%2==0){
	        for(int i = 0; i<n; i++)
	            if(carNumber[i]%2!=0){
	                answer = answer + penalty[i];
	            }
	    }
	    else{
	        for(int i = 0; i<n; i++)
	            if(carNumber[i]%2==0){
	                answer = answer + penalty[i];
	            }
	    }
	    cout<<answer<<endl;
	}
	return 0;
}
