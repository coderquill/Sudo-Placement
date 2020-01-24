#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    cin.ignore();
    for(int i = 0; i<t; i++){
        string in,temp;
		getline(cin,in);
		stringstream X(in);
		stack <string> s;
		
		while(getline(X,temp,'.')){
			s.push(temp);
		}
		while(!s.empty()){
	        cout << s.top(); 
	        s.pop();
	        if(!s.empty()){
	            cout <<".";
	        }
	    }
	    cout<<endl;
	
    }
	return 0;
}
