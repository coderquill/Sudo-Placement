//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0/?track=sp-arrays-and-searching
#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	int testCases;
	cin>>testCases;
	for(int t= 0; t<testCases; t++){
	    int totalPackets;
	    cin>>totalPackets;
	    int arrayOfPackets[totalPackets];
	    for(int i = 0; i<totalPackets; i++){
	        cin>>arrayOfPackets[i];
	    }
	    sort(arrayOfPackets, arrayOfPackets+totalPackets);
	    int totalStudents;
	    cin>>totalStudents;
	    int difference = arrayOfPackets[totalStudents-1]-arrayOfPackets[0];
	    int i = 1;
	    while(i+totalStudents-1<totalPackets){
	        if(difference>arrayOfPackets[i+totalStudents-1]-arrayOfPackets[i]){
	            difference = arrayOfPackets[i+totalStudents-1]-arrayOfPackets[i];
	        }
	       //cout<<i<<"="<<arrayOfPackets[i+totalStudents-1]<<","<<arrayOfPackets[i]<<","<<difference<<endl;
	       i++;
	    }
	    cout<<difference<<endl;
	}
	return 0;
}
