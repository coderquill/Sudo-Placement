//https://practice.geeksforgeeks.org/problems/remainder-with-7/1/?track=sp-strings
{
	#include <iostream>
	using namespace std;
	int remainderWith7(string );
	int main(){
	
		int t;
		cin>>t;
		while(t--){
			string n;
			cin>>n;
			cout<<remainderWith7(n)<<endl;
		}
		return 0;
	}
}


int remainderWith7(string string){
    int length = string.length();
    if(length == 1){
        return (string[0]-48)%7;
    }
    int number = ((string[0]-48)*10)+(string[1]-48);
    int remainder = number % 7;
    for(int i = 2; i<length; i++){
        number = remainder * 10 + (string[i]-48);
        remainder = number % 7;
    }
    return remainder;
    
}
