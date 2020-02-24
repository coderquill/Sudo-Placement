
//https://practice.geeksforgeeks.org/problems/count-subsequences-of-type-ai-bj-ck4425/1
// { Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;

int fun(string &str);
 
int main()
 {
    int t;
    cin>>t;
    while(t--) {
        string s;
        cin>>s;
        cout<<fun(s)<<endl;
    }
	return 0;
}// } Driver Code Ends
//User function template 

// str : given string
// return the expected answer
int fun(string &str) {
    string s = str;
    int aCount = 0, bCount = 0, cCount = 0;
    
    for(int i=0; i<str.length(); i++){
        if(s.at(i) == 'a')
            aCount = 1+2*aCount;
        if(s.at(i) == 'b')
            bCount = aCount+2*bCount;
        if(s.at(i) == 'c')
            cCount = bCount+2*cCount;
    }
    return cCount;
}
