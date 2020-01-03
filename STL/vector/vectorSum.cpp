/*https://practice.geeksforgeeks.org/problems/pair-sum-in-vector/1*/

{

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
void sum(vector<pair<int,int>>v);

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<pair<int,int>>v; //Making a vector that holds pairs
	    for(int i=0;i<n;i++)
	    {
	        int x,y;
	        cin>>x>>y;
	        v.push_back(make_pair(x,y)); //Pushing a pair in the vector
	    } 
	    
	   sum(v); //The sum function
	   
	}
	return 0;
}

}

void sum(vector<pair<int,int>>v)
{
    long long sum=0;
    for(auto x : v){
        sum = sum+x.second;
    }
   
    cout<<sum;
    cout<<endl;
}
