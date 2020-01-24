/*
// Sample code to perform I/O:

cin >> name;                            // Reading input from STDIN
cout << "Hi, " << name << ".\n";        // Writing output to STDOUT

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/

// Write your code here
#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    
    int n;
    cin>>n;
    int k = 0;
    for(int t=0; t<n; t++){
        stack<char> mystack;
        string s;
        cin>>s;
        for(int i = 0; i<s.length(); i++){
            if(s.at(i) == '(' && (mystack.top() == '(' || mystack.empty())){
                mystack.push(s.at(i));
               
            }
            else if(s.at(i) == ')' && (mystack.top() == '(' || !mystack.empty()))
            {
                if(s.at(i+1)=='('){
                    k = k+2;
                    mystack.pop();
                    break;
                }
                mystack.pop();
                k=k+2;
            }
            else if(s.at(i) == ')' && mystack.empty())
            {
                break;
            }
        }
        cout<<k<<endl;
        
    }
    return 0;
    
}
