//cpp program for making strings of unique elements and duplicate elements from a string
#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
void display(string s){
	string u;
	for(int i = 0; i<s.length(); i++){
		if(u.find(s[i])==string::npos){
			u = u+s[i];
			//s.erase(s.find(s[i]),1);	
		}
	}
	for(int i = 0; i<u.length(); i++){
		s.erase(s.find(u[i]),1);
	}

	cout<<u<<endl;
	cout<<s;
	
}
int main(){
	string s = "geeksforgeeks";
	display(s);
	return 0;
}

