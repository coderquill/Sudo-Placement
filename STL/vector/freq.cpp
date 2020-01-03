#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
	int testCases;
	cin>>testCases;
	for(int k = 0; k<testCases; k++){
		int n,x,frequency=0;
		cin>>n;
		vector<int> v;
		for(int i = 0; i<n; i++){
			int j;
			cin>>j;
			v.push_back(j);
		}
		cin>>x;
		for(int i = 0; i<n; i++)
			if(v[i] == x)
				frequency++;
		cout<< frequency;
		
	}

	return 0;
}
