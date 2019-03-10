//https://practice.geeksforgeeks.org/problems/aryas-long-string/0/?track=sp-strings

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        string s;
        
        char u;
        int k,n;
        cin>>s>>k>>n>>u;
        int h[26]={0};
        for(int i=0;i<s.size();i++){
            h[s[i]-'A']++;
        }
        
        int l=s.size();
        int z=n%l;
        int y=n/l;
        string g=s.substr(0,z);
        int c=0;
        for(int i=0;i<g.size();i++){
            if(g[i]==u)
            c++;
        }
       cout<<y*h[u-'A']+c<<endl;
    }
	
	return 0;
}
