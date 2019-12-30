/*Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5*/

#include<bits/stdc++.h>
#include<iostream>
typedef long long int ll;
using namespace std;

int main()
{
    
    
    int t; cin>>t;
    while(t--)
    {
        int n,res=0; cin>>n;
        vector<int>v(n);
        
        for(int i=0;i<n;i++)cin>>v[i];
        sort(v.begin(),v.end());
        
        for(int i=n-1;i>=0;i--)
        {
            int a=v[i],b=0,c=i-1,x;
            while(b<c)
            {
                x=v[b]+v[c];
                if(x==a){res++;b++;c++;}
                else if(x<a)b++;
                else c--;
            }
        }
        if(res==0)cout<<-1;
        else cout<<res;
        
        cout<<endl;
    }
    return 0;
}

