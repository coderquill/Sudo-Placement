#include<bits/stdc++.h>
using namespace std;
bool check(int n)
    {
    if(n<10)    return 1;
    string str=to_string(n);
    int l=str.length()-1;
    if(abs(str[l]-str[l-1])!=1) return 0;
    int i=1;
    while(i!=l)
        {
        if(abs(str[i]-str[i-1])!=1 || abs(str[i]-str[i+1])!=1)
            return 0;
        ++i;
        }
    return 1;
    }
int main(){
int arr[1005];
int t;
scanf("%d",&t);
while(t--){
    int n,k;
    scanf("%d %d",&n,&k);
    for(int i=0;i<n;i++)    scanf("%d",&arr[i]);
    bool flag=0;
    for(int i=0;i<n;i++)
        if(arr[i]<k && check(arr[i]))
            {
            flag=1;
            printf("%d ",arr[i]);
            }
    if(!flag)  printf("-1");
    printf("\n");
    }
return 0;
}
