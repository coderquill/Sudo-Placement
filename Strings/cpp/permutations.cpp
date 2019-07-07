//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0/?track=sp-strings&batchId=122
#include <iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
void perm(string s, int l, int r){
    if(l==r){
        cout<<s<<" ";
        return;
    }
    else{
        for(int i = l; i<s.length(); i++){
        swap(s[l],s[i]);
        perm(s,l+1,r);
        swap(s[l],s[i]);
        }
    }
    
}
int main() {
    int t;
    cin>>t;
    for(int i = 0; i<t; i++){
	string s1;
	cin>>s1;
	perm(s1,0,s1.length());
	cout<<endl;
    }
	return 0;
}
