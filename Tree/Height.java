import java.util.*;
import java.lang.Math;

class Height{
	Node root;
	class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data= data;
			this.left = null;
			this.right = null;
		}
		Node getLeft(){
			return left;
		}
		Node getRight(){
			return right;
		}
	}
	
	public int height(Node node){
		if(node == null)
			return 0;
		return 1+Math.max(height(node.left), height(node.left));
	}

	
	private Node insert(int[] arr,Node node, int i){
		if(i<arr.length)
			{
				Node new_node = new Node(arr[i]);
				node = new_node;
				node.left = insert(arr, node.left, 2*i+1);
				node.right = insert(arr, node.right, 2*i+2);
				
			}
		return node;
	}

	public void inorder(Node root){
	if(root!=null){
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	}

	public static void main(String args[]){
		Height t = new Height();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		t.root = t.insert(arr,t.root,0);
		t.inorder(t.root);
		System.out.println(t.height(t.root));
	}
	
}



