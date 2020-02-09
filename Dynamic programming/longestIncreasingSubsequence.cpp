#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
	int a[8] = {3,4,-1,0,6,2,3};
	int t[8];
	for(int i = 0; i<7; i++){
		t[i]=1;
	}
	for(int i=1;i<7;i++){
		for(int j=0;j<i; j++){
			if(a[j]<a[i])
				t[i]=max(t[i],t[j]+1);
		}
	}
	for(int i=0;i<7;i++){
		cout<<t[i]<<" ";
	}
	return 0;
}
