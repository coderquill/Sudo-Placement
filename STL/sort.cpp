#include<iostream>
#include<bits/stdc++.h>
using namespace std;
typedef struct ex{
	int x;
	int y;
};
bool compareInterval(ex ex1, ex ex2){
	return ex1.x>ex2.x;
}
int main(){
	
	ex a[] = {{1,4},{2,3}, {3,2}};
	int n = sizeof(a)/sizeof(a[0]);
	sort(a,a+3, compareInterval);
for(int i = 0; i<3; i++)
	cout<<a[i].x<<" "<<a[i].y<<endl;
return 0;
	
}
