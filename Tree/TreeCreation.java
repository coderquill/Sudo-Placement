/*import java.util.*;
class TreeCreation{
	Node root;
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			this.left = null; 
			this.right = null;		
		}
		public Node getLeft(){
			return this.left;		
		}
		public Node getRight(){
			return this.right;		
		}
		public int getData(){
			return this.data;		
		}
		public void SetLeft(Node node){
			this.left = node;		
		}
		public void SetRight(Node node){
			this.right = node;		
		}
		public void SetData(int data){
			this.data = data;		
		}
		
		
		
	}

		public boolean isEmpty(){
			return root == null;
		}

		public void insert(int data){
			root = insert(root, data);
		}
		private Node insert(Node node, int data){
			if(node == null)
				node = new Node(data);
			else{
				if(node.getRight() == null)
					node.right = insert(node.right, data);
				else 
					node.left = insert(node.left, data);
			}
			return node;
		}

		public void inorder(Node r){
			if(r!=null){
				inorder(r.getLeft());
				System.out.println(r.getData());
				inorder(r.getRight());
			}
		}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		TreeCreation t = new TreeCreation();
		int n = scan.nextInt();
		for(int i = 0; i<n; i++){
			t.insert(scan.nextInt());
		}
		
		System.out.print("inorder:");
		t.inorder(t.root);	
	}

	
	
}*/


import java.util.*;
import java.io.*;

class node{
	int data;
	node left;
	node right;
	node(){
		this.data = null;
		this.left = null;
		this.right = null;
	}
	static int getData(node root){
		return root.data;
	}
	static node getLeft(node root){
		return root.left;
	}
	static node getRight(node root){
		return root.right;
	}
	static int setData(node root, int i){
		return root.data = i;
	}
	static node setLeft(node root, node newNode){
		return root.left = newNode;
	}
	static node getRight(node root, node newNode){
		return root.right = newNode;
	}
}
class TreeCreation{
	public static void main(String args[]){
		int n;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		node root
		for(int i=0;i<n; i++){
			
		}
	}

}




























