#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
	//int a[7] = {1,2,3,1,4,2,5};
	string str = "ruparpl";	
	set<char> s;
	for(int i = 0; i<7; i++){
		s.insert(str[i]);

	}
	set<char>::iterator itr;
	for(itr = s.begin(); itr!=s.end(); itr++){
		cout<<*itr;	
	}
}
