package CTCI;

class Node{
	public Node(int i) {
		this.data = i;
	}
	int data;
	Node next;
}

public class Solution22 {

	public static int kthtolast(Node head, int k){
		if(head==null){
			return -1;
	}
	Node temp = head;
	for(int i=1;i<=k&&temp.next!=null;i++){
		temp = temp.next;
	}
	Node iter = head;
	while(temp!=null){
		iter = iter.next;
		temp = temp.next;
	}
	return iter.data;
	}

	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp = new Node(2);
		head.next = temp;
		temp.next = new Node(3);
		temp=temp.next;
		temp.next = new Node(4);
		temp=temp.next;
		temp.next = new Node(5);
		temp=temp.next;
		temp.next = new Node(6);
		
		System.out.println(kthtolast(head, 2));
		
	}

}
