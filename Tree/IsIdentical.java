import java.util.*;
class IsIdentical{
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
	public static Node insert(int[] arr, Node root, int i){
		if(i<arr.length){
			Node temp = new Node(arr[i]);
			root = temp;
			root.left = insert(arr,root.left,2*i+1);
			root.right = insert(arr,root.right,2*i+2);
		}
		return root;
	}
	public static boolean isIdentical(Node x, Node y){
		if(x == null && y == null)
			return true;
		return (x!=null && y!=null)&&(x.data==y.data)
			&& isIdentical(x.left,y.left) && isIdentical(x.right, y.right);
	}
	public static void main(String args[]){
		IsIdentical t1 = new IsIdentical();
		IsIdentical t2 = new IsIdentical();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0;i<n; i++){
			arr1[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0;i<m; i++){
			arr2[i] = scan.nextInt();
		}
		t1.root = insert(arr1,t1.root,0);
		t2.root = insert(arr2,t2.root,0);
		if(isIdentical(t1.root, t2.root))
			System.out.println("identical");
		else
			System.out.println("not identical");
	}
}
