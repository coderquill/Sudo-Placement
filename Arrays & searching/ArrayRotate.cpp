//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0/?track=sp-arrays-and-searching

#include <iostream>
#include <vector>
using namespace std;

int main() {
	int t;
	cin>>t;
	int n, k;
	while(t--){
	    cin>>n>>k;
	    vector<int> a(n);
	    for(int i=0; i<n; i++){
	        cin>>a[i];
	    }
	    for(int i=k%n; i<n; i++){
	        cout<<a[i]<<" ";
	    }
	    for(int i=0; i<k%n; i++){
	        cout<<a[i]<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}
