#include<iostream>
#include <bits/stdc++.h> 

using namespace std; 

int find(int a[]){
	unordered_map<int,int> mp;
	
	for(int i = 0; i<a.length; i++){
		mp[a[i]]++;
	}
	for(auto x : mp)
		cout<<x.first<<" "<<x.second<<" "<<endl;
	return 0;
}
int main(){
	int testCases;
	cin>>testCases;
	for(int t = 0; t<testCases; t++){
		int n;
		cin>>n;
		int a[n];
		for(int i = 0; i<n; i++){
			cin>>a[i];
		}
		int x = find(a);
		cout<<x;
		
	}
}
