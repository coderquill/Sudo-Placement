#include<iostream>
#include<bits/stdc++.h>
using namespace std;

/*bool comparator(const pair<int,int> &a, const pair<int, int>&b){
	return a.second<b.second;
}*/

int main(){
	
	int t;
	cin>>t;
	for(int j = 0; j<t; j++){
		int n;
		cin>>n;
		vector< pair<int,int> > v;
		int sum = 0;
		for(int i = 0; i<n; i++){
			int x,y;
			cin>>x>>y;
			sum = sum+y;
			v.push_back(make_pair(x,y));
		}
		
		cout<<sum;
	
	}
	return 0;
}
