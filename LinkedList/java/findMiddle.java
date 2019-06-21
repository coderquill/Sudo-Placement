import java.util.*;
class findMiddle{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void print(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println("null");
	}
	public int find(){
		Node slow = head;
		Node fast = head;
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	public static void main(String args[]){
		int[] arr = new int[5];	
		findMiddle sll = new findMiddle(); 
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<5; i++)
			arr[i] = scan.nextInt();
		for(int i = 4; i>=0; i--){
			sll.push(arr[i]);
		}
		sll.print();
		System.out.println(sll.find());
	}

}
