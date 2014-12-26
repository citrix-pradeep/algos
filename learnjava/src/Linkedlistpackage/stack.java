package Linkedlistpackage;

import java.util.EmptyStackException;

public class stack extends LinkedList{
 
	public void push(int data){
		Node newnode=new Node(data);
		Node ptr;
		newnode.next=null;
		if(head==null){
		head=newnode;
		}
		else{
			ptr=head;
			while(ptr.next!=null){
				ptr=ptr.next;
			}
			ptr.next=newnode;	
		}
	}
	public int pop(){
		int item = 0;
		Node ptr=head;
		Node loc=ptr.next;
		if(head==null)
		{
			throw new EmptyStackException();
		}
		else if(head.next==null)
		{
			item=head.data;
			head=null;
		}
		else
		{
		 while(loc.next!=null){
			 ptr=loc;
			 loc=loc.next;
		 }
		 ptr.next=null;
		 item=loc.data;
		}
		return item;
	}
	public void display() {
		if(head==null){
			System.out.println("Stack is empty");
		}
		else{
			for(Node temp = head;temp!=null;temp=temp.next)  
            System.out.print(temp.data + "\t");  
            System.out.println();
		}
	}
	
	public static void main(String[] args) {
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.push(15);
		s.display();

	}

}
