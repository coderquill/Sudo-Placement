//https://practice.geeksforgeeks.org/problems/distinct-palindromic-substrings/0/?track=sp-strings&batchId=105

#include <bits/stdc++.h>
using namespace std;
int common(string s,string s2,int start){
    int x=0;
    for(int i=start,j=0;i<s.length()&&j<s2.length();i++,j++){
        if(s[i]==s2[j]){
            x++;
            //cout<<x<<endl;
        }
        else
            break;
    }
    return x;
}
int main() {
  int t;
  cin>>t;
  while(t--){
      string s;
      cin>>s;
      set<string> st;
      int count=0;
      int n=s.length();
      int i=0;
      int x;
      string temp="",s2="";
      for(int j=0;j<n;j++){
        temp=s[j];
        st.insert(temp);
      }

      temp="";
      while(i<n-1){
          temp=s[i]+s2;
          i=i+1;
          //cout<<s[i]<<" "<<s2[0]<<endl;
          x = common(s,s2,i);
          if(x!=0){
            string temp2 = temp.substr(0,x+1);
            reverse(temp2.begin(),temp2.end());
            temp2 = temp2+s.substr(i,x);
            st.insert(temp2);
            while(temp2.length()>3){
                temp2 = temp2.substr(1,temp2.length()-2);
                st.insert(temp2);
            }
          }
          x = common(s,temp,i);
          if(x!=0){
            string temp2 = temp.substr(0,x);
            reverse(temp2.begin(),temp2.end());
            temp2 = temp2+s.substr(i,x);
            st.insert(temp2);
            while(temp2.length()>2){
                temp2 = temp2.substr(1,temp2.length()-2);

                st.insert(temp2);
            }
          }
          s2=temp;
      }
      cout<<st.size()<<endl;
  }
  return 0;
}
