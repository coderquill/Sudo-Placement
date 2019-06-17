import java.util.*;

class BtNode{
	int data;
	BtNode left,right;
	BtNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public void setLeft(BtNode n){
		left = n;
	}
	public void setRight(BtNode n){
		right = n;
	}
	public void setData(int d){
		data = d;
	}
	public BtNode getLeft(){
		return left;
	}
	public BtNode getRight(){
		return right;
	}
	public int getData(){
		return data;
	}
}

class Bt{
	 BtNode root;
	public Bt()
	{
		root = null;
	}
	public boolean isEmpty(){
		return root == null;
	}
	public void insert(int data){
		root = insert(root, data);
	}
	private BtNode insert(BtNode node, int data){
		if(node == null)
			node = new BtNode(data);
		else{
			if(node.getRight() == null)
				node.right = insert(node.right, data);
			else 
				node.left = insert(node.left, data);
		}
		return node;
	}
	public int countNodes(){
		return countNodes(root);
	}
	private int countNodes(BtNode r){
		if(r == null)
			return 0;
		else{
			int l = 1;
			l = l+countNodes(r.getLeft());
			l = l+countNodes(r.getRight());
			return l;
		}
	}

	public boolean search(int k){
		return search(root, k);
	}
	private boolean search(BtNode r, int k){
		if(r.getData() == k)
			return true;
		if(r.getLeft() != null){
			if(search(r.getLeft(),k))
				return true;
		}
		if(r.getRight() != null){
			if(search(r.getRight(), k))
				return true;
		}
		return false;
	}
	public void inorder(BtNode r){
		if(r!=null){
			inorder(r.getLeft());
			System.out.println(r.getData());
			inorder(r.getRight());
		}
	}

}
public class BinaryTree{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Bt bt = new Bt();
		int n = scan.nextInt();
		for(int i = 0; i<n; i++){
			bt.insert(scan.nextInt());
		}
		int k = scan.nextInt();
			System.out.println(bt.search(k));
		System.out.println(bt.countNodes());
		System.out.print("inorder:");
		bt.inorder(bt.root);	
	}
}
