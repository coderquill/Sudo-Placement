/*https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1*/
#include<bits/stdc++.h>
using namespace std;
struct node
{
  int data;
  struct node*next,*prev;
  
  node(int x){
      data = x;
      next = NULL;
      prev = NULL;
  }
  
};
struct node* update(struct node*start,int p);
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,p;
        cin>>n>>p;
        struct node*start = NULL;
        struct node* cur = NULL;
        struct node* ptr = NULL;
        
        for(int i=0;i<n;i++)
        {
            int a;
            cin>>a;
            ptr=new node(a);
            ptr->data=a;
            ptr->next=NULL;
            ptr->prev=NULL;
            if(start==NULL)
            {
                start=ptr;
                cur=ptr;
            }
            else
            {
                cur->next=ptr;
                ptr->prev=cur;
                cur=ptr;
            }
        }
        struct node*str=update(start,p);
        while(str!=NULL)
        {
            cout<<str->data<<" ";
            str=str->next;
        }
        cout<<endl;  
    }
}
ss
/*
struct node
{
  int data;
  struct node*next,*prev;
  
  node(int x){
      data = x;
      next = NULL;
      prev = NULL;
  }
  
};
*/
struct node*update(struct node*start,int p)
{
    struct node* temp1 = NULL;
    struct node* temp2 = NULL;
    struct node* temp3 = NULL;
    temp1=start;
    temp2 = start;
    temp3 = start;
    for(int i = 0; i<p; i++){
        temp2 = temp2->next;
    }
    while(temp3->next!=NULL){
        temp3 = temp3->next;
    }
    temp3->next = temp1;
    temp1->prev = temp3;
    (temp2->prev)->next = NULL;
    temp2->prev = NULL;
    
    return temp2;
    
}
