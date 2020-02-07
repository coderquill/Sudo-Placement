#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
	int testCases;
	cin>>testCases;
	while(testCases--){
	    int n,k;
	    cin>>n>>k;
	    int x;
	    priority_queue<int>pq;
	    for(int i =0; i<n; i++){
	    	cin>>x;
		pq.push(x);
	    }
	    for(int i = 0; i<k; i++){
	        cout<<pq.top()<<" ";
		pq.pop();
	    }
	    cout<<endl;
	}
	return 0;
}
