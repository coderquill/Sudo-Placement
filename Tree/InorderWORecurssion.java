import java.util.*;
class InorderWORecurssion{
	Node root;
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data= data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void inorder(Node root){
		if(root==null)
			return;
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
		while(temp!= null || stack.size()>0){
			while(temp!=null){
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			System.out.print(temp.data);
			temp = temp.right;
		}
	}
	/*public static Node insert(int key, Node temp){
		if(temp == null){
			temp.data = key;
			return temp;
		}
		else if(temp.left!=null){
			Node new_node = new Node(key);
			temp.right = new_node;
			return temp.left;
		}
		else{
			Node new_node = new Node(key);
			temp.left = new_node;
			return temp;
		}
	}*/
	public static Node insert(int[] arr, Node root, int i){
		if(i<arr.length){
			Node new_node = new Node(arr[i]);
			root = new_node;
			root.left = insert(arr,root.left,2*i+1);	
			root.right = insert(arr,root.left,2*i+2);		
		}
		return root;
	}
	
	public static void main(String args[]){
		InorderWORecurssion t = new InorderWORecurssion();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		t.root = insert(arr,t.root,0);
		inorder(t.root);
	}
}
