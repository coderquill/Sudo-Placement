/*#include <iostream>
#include<stdlib.h>
using namespace std;

struct Node{
	int data;
	struct Node* next;
};

struct Node* head = NULL;

void insert(int n){
	if(head == NULL){
		head->data = n;
		head->next = NULL;
		
	}
	else{
		struct Node* temp = head;
		while(temp->next!=NULL){
			temp = temp->next;
		}
			struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
			\
			new_node->data = n;
		new_node->next = NULL;	
		temp->next = new_node;
		temp = new_node;
	}
}

void printLL(struct Node* head){
	struct Node* temp;
	temp = head;
	while(temp->next!=NULL){
		cout<<temp->data<<" ";
		temp = temp->next;
	}
}

int main(){
	int n,j;
	cin>>n;
	for(int i = 0; i<n; i++){
		
		cin>>j;
		insert(j);	
	}
	printLL(head);
	return 0;
	
}*/
#include <iostream>
#include<stdlib.h>
using namespace std;
struct Node { 
   int data; 
   struct Node *next; 
}; 
struct Node* head = NULL;   
void insert(int new_data) { 
   if(head==NULL){
   struct Node* new_node = (struct Node*) malloc(sizeof(struct Node)); 
   new_node->data = new_data; 
   new_node->next = NULL; 
	head = new_node; 
   }
else{
	struct Node* temp = head;
	while(temp->next!=NULL)
		temp=temp->next;
	struct Node* new_node = (struct Node*) malloc(sizeof(struct Node)); 
   new_node->data = new_data; 
   new_node->next = NULL; 
   temp->next = new_node; 	
   temp = new_node; 
}
} 
void display() { 
   struct Node* ptr;
   ptr = head;
   while (ptr != NULL) { 
      cout<< ptr->data <<" "; 
      ptr = ptr->next; 
   } 
} 
int count(){
	int i = 1;
 struct Node* temp = head;
	while(temp->next!=NULL){
		i++;	
		temp = temp->next;
	}
	return i;
}
bool search(int k){
	
 struct Node* temp = head;
	while(temp->next!=NULL){
		if(temp->data==k)
			return true;	
		temp = temp->next;
	}
	return false;
}
void deletenode(int k){
	struct Node* temp = head;
	while(temp->data!=k){
		temp=temp->next;	
	}
	struct Node* prev = head;
	while(prev->next!=temp)
		prev = prev->next;
	prev->next = temp->next;
	temp->next = NULL;
	delete(temp);
}
int main() { 
   int n,j,k;
	cin>>n;
	for(int i = 0; i<n; i++){
		cin>>j;
		insert(j);
	}
   cout<<"The linked list is: ";
   display(); 
   cout<<count();
	cin>>k;
	cout<<search(k);
	deletenode(k);
	display();
	
   return 0; 
}
