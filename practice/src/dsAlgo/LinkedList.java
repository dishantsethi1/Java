package dsAlgo;

public class LinkedList {
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
		
	public void push(int data)
	{
		Node temp=new Node(data);
		temp.next=head;
		head=temp;	
	}
	
	public void append(int data)
	{
		Node temp=new Node(data);
		
		if(head==null)
		{
			head=new Node(data);
			return ;
		}
		
		temp.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=temp;
		return ;
		
	}
	
	void deleteNode(int key)
	{
		
		Node temp=head;
		Node prev=null;
		if(temp.data==key) {head=temp.next; return ;}
		while(temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		
		if(temp.next==null && temp.data!=key) return ;
		else if(temp.next==null && temp.data==key) {prev.next=null;return ;}
		prev.next=temp.next;
		
	}
	
	public void printList() 
	{
		Node t=head;
		while(t!=null)
		{
			System.out.println(t.data +" ");
			t=t.next;
		}
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.push(56);
		ll.push(45);
		ll.append(34);
		ll.deleteNode(45);
		ll.printList();

	}

}
