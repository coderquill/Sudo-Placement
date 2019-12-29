#include<iostream>
#include<bits/stdc++.h>
//#include<vector>
using namespace std;

vector<int> getVector(vector<int> &v){
	v.assign(5,3);
	int x;
	while(cin>>x && x!=0){
		v.push_back(x);	
	}
	return v;

}
void printVector(vector<int> &v){
	for(int i = 0; i<v.size(); i++){
		cout<<v[i]<<" ";	
	}
	cout<<endl;
	
}

int main(){
	vector<int> v;
	v = getVector(v);
	printVector(v);
	cout<< v.size()<<endl;
	cout<< v.at(1)<<endl;
	cout<< v.front()<<endl;
	cout<< v.back()<<endl;
	cout<< v.empty()<<endl;
	//modifications
	v.insert(v.begin(),6);
	printVector(v);
	v.erase(v.begin()+7);
	printVector(v);

	//functions
	sort(v.begin(), v.end());
	printVector(v);
	sort(v.begin(), v.end(), greater<int>());
	printVector(v);
	reverse(v.begin(), v.end());
	printVector(v);
	v.clear();
	cout<<"vector:";
	printVector(v);
	
	
	
	
	return 0;
}

/*
output:
2
8
6
9
0
3 3 3 3 3 2 8 6 9 
9
3
3
9
0
6 3 3 3 3 3 2 8 6 9 
6 3 3 3 3 3 2 6 9 
2 3 3 3 3 3 6 6 9 
9 6 6 3 3 3 3 3 2 
2 3 3 3 3 3 6 6 9 
vector:


*/



