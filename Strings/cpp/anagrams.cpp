#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
void display(string s1, string s2){
        if(s1.length()!=s2.length()){
		cout<<"no"<<endl;
		return;
	}
	else{
		for(int i = 0; i<s1.length(); i++){
			int index = s2.find(s1[i]);
                if(index!=string::npos){
                        s2.erase(index,1);
                        //s.erase(s.find(s[i]),1);      
                }
		else{
			cout<<"No"<<endl;
			return;
		}
		}
        }
       	cout<<"YES"<<endl;
        cout<<"s1"<<s1<<endl;
        cout<<"s2"<<s2;
	
        

}
int main(){
        string s1 = "pars";
	string s2 = "spar";
        display(s1,s2);
        return 0;
}


