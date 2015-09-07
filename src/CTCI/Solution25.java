package CTCI;

public class Solution25 {

	public static void main(String[] args) {
		Node head1 = new Node(7);
		Node temp = new Node(1);
		head1.next = temp;
		temp.next = new Node(9);
		
		Node head2 = new Node(5);
		Node temp2 = new Node(9);
		head2.next = temp2;
		temp2.next = new Node(2);
		
		Node res = sumLists(head1, head2, 0);
		System.out.println();
	}

	public static Node sumLists(Node head1, Node head2, int carry){
		Node resHead = null;
	if(head1==null && head2==null && carry>0){
		return new Node(carry);
	}else if(head1==null && head2==null && carry==0){
		return null;
	}else if(head1==null){
		return head2;
	}else if(head2==null){
		return head1;
	}

	resHead = new Node(head1.data+head2.data+carry>9?(head1.data+head2.data+carry)%10:head1.data+head2.data+carry);
	carry = carry(head1.data,head2.data,carry);
	resHead.next = sumLists(head1.next,head2.next,carry);
	return resHead;
	}

	static int carry(int a, int b,int c){
		return (a+b+c>10?(a+b+c)/10:0);
	}
	
}
