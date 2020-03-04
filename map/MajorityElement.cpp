#include<bits/stdc++.h>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t--){
	    map<char, int> m;
	    string str;
	    cin>>str;
	    int flag = 1;
	    for(int i=0; i<str.length(); ++i){
	        m[str[i]]++;
	    }
	    for(int i=0; i<str.length(); ++i){
	        if(m[str[i]]>ceil((str.length()/2+1))){
	            flag = 0;
	            break;
	        }
	    }
	    (flag==1)?(cout<<1<<endl):(cout<<0<<endl);
	}
	return 0;
}
