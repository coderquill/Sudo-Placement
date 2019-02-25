//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0/?track=sp-strings

#include <bits/stdc++.h>
using namespace std;
 
stack<string> s;
 
int main() {
	string st;
	cin >> x;
	for(int i=0;i<st.length();i++){
		if(st[i]==' '){
			s.push(x);
			x.clear();
			continue;
		}
		x+=st[i];
	}
	s.push(x);
	while(!s.empty()){
		x=s.top();
		s.pop();
		cout<<x<<" ";
	}
	return 0;
}
