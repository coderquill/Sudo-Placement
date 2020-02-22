import java.util.*;
class MakeATree{
	static Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		public Node getLeft(){
			return left;
		}
		public Node getRight(){
			return right;
		}
	}
	
	public static void insert(int data){
		root = insert(root,data);
	}

	/*private static Node insert(Node node ,int data){
		if(node == null){
			node = new Node(data);
		}
		else {
			if(node.getLeft() == null)
				node.left = insert(node.left, data);	
			else
				node.right = insert(node.right, data);
		}
		return node;
	
	}*/
private static Node insert(Node node, int data){
		if(node == null)
			node = new Node(data);
		else{
			if(node.getLeft() == null)
				node.left = insert(node.left, data);
			else 
				node.right = insert(node.right, data);
		}
		return node;
	}

	public static void inorder(Node root){
		if(root !=null){
			inorder(root.left);
			System.out.print(root.data);
			inorder(root.right);
		}
		
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		MakeATree t = new MakeATree();
		for(int i = 0; i<n; i++){
			t.insert(scan.nextInt());
		}
		inorder(t.root);
	}
}
