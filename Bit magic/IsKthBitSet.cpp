//https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not/0/?track=sp-bit-magic&batchId=105

#include <iostream>
#include<bits/stdc++.h>
using namespace std;

void kbitSet(int n,int k)
{
    if(k==0)
    {
        if(n%2!=0)
        {
            cout<<"Yes"<<endl;
            return;
        }
        else
        {
            cout<<"No"<<endl;
            return;
        }
    }
    
    int c = 0;
    int p = n;
    bool flag = false;
    while(p)
    {
        if(p%2!=0 && c==k)
        {
            flag = true;
            break;
        }
        c++;
        p >>= 1;
    }
    if(flag)
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }
    
}

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n,k;
	    cin>>n;
	    cin>>k;
	    kbitSet(n,k);
	    
	}
	return 0;
}
