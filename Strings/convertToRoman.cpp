//https://practice.geeksforgeeks.org/problems/convert-to-roman-no/1/?track=sp-strings

#include <bits/stdc++.h>
using namespace std;
void convertToRoman(int ) ;
int main() {
	
	int testCases;
	cin>>testCases;
	while(testCases--){
		int n;
		cin>>n;
		
	convertToRoman(n);
	cout<<endl;
		
	}
	return 0;
}

void convertToRoman(int n) {

	while(n){
		if(n>=1000){
     		   cout<<"M";
    		   n=n-1000;  
      		}else if(n>=900){
  		   cout<<"CM";
       		   n=n-900;
    		}else if(n>=500){
 		   cout<<"D";
                   n=n-500;
    		}else if(n>=400){
  		   cout<<"CD";
                   n=n-400;
    		}else if(n>=100){
 		   cout<<"C";
                   n=n-100;
    		}else if(n>=90){
  		   cout<<"XC";
                   n=n-90;
    		}else if(n>=50){
  		   cout<<"L";
      		   n=n-50;
    		}else if(n>=40){
  		   cout<<"XL";
       		   n=n-40;
    		}else if(n>=10){
  		   cout<<"X";
       		   n=n-10;
    		}else if(n>=9){
  		   cout<<"IX";
       		   n=n-9;
    		}else if(n>=5){
  		   cout<<"V";
       		   n=n-5;
		}else if(n>=4){
  		   cout<<"IV";
                   n=n-4;
    		}else if(n>=1){
  		   cout<<"I";
       		   n=n-1;
    		}
  	}
}
