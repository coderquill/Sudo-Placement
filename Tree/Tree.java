import java.util.*;
class Tree{
	Node root;
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static Node insert(int[] arr, Node root, int i){
		if(i<arr.length){
			Node newNode = new Node(arr[i]);
			root = newNode;
			root.left = insert(arr, root.left, 2*i+1);
			root.right = insert(arr, root.right, 2*i+2);
		}
		return root;
	}
	public static void inorder( Node root){
		if(root!=null){
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	public static void main(String args[]){
		Tree t = new Tree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		t.root = insert(arr, t.root, 0);
		t.inorder(t.root);
		}
	}
