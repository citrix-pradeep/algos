package Linkedlistpackage;   

import java.util.Scanner;

class Node  
{  
     int data;   
     Node next;   
     Node(int d)// node class Constructor.   
     {  
           data = d;   
          next= null;   
     }  
} 

class LinkedList  
{  
	Node head=null;
	// add node begin
	public void addnode_begin(int item)
	{
	Node newnode=new Node(item);
	if(head==null){
		newnode.next=null;
		head=newnode;
	}
	else{
		newnode.next=head;
		head=newnode;
		}
	}
	//add node at end
	public void addnode_end(int item)
	{
	Node newnode=new Node(item);
	Node ptr;
	if(head==null){
		newnode.next=null;
		head=newnode;
	}
	else{
		ptr=head;
		while(ptr.next!=null){
			ptr=ptr.next;
		}
		newnode.next=null;
		ptr.next=newnode;
		}
	}
	
	//#####delete from begin####
	
	public int deletebegin(){
		int item = 0;
		if(head==null)
		{
			System.out.println("list is empty ,no element to delete");
		}
		else if(head.next==null)
		{
			item=head.data;
			head=null;
		}
		else
		{
		 item=head.data;
			head=head.next;
		}
		return item;
	}
	//##########delete at end############
	public int deleteatend(){
		int item = 0;
		Node ptr=head;
		Node loc=ptr.next;
		if(head==null)
		{
			System.out.println("list is empty ,no element to delete");
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
	
	//#####display List###########
	public void display()
	{
		if(head==null){
			System.out.println("list is empty");
		}
		else{
			for(Node temp = head;temp!=null;temp=temp.next)  
            System.out.print(temp.data + "\t");  
            System.out.println();
		}
	}
	
	
public static void main(String[]args)  
{ 
	LinkedList l1=new LinkedList();
	
	Scanner in = new Scanner(System.in);  
	int data,choice;  
	while(true)
	{
		System.out.println("1-Add item in the begin"+"\n"+"2-add item at end"+"\n"+"3-delete from begin and 4-display"+"\n"+"5-delete at end");
		choice=in.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println("enter element to insert at begin:");
			data=in.nextInt();
			l1.addnode_begin(data);
			break;
		case 2:
			System.out.println("enter element to insert at end:");
			data=in.nextInt();
			l1.addnode_end(data);
			break;
		case 3:
			data=l1.deletebegin();
			System.out.println("item deleted:"+data);
			break;
			
		case 5:
			data=l1.deleteatend();
			System.out.println("item deleted from end:"+data);
			break;
		case 4:
			l1.display();
			break;

		default:System.exit(0);
		}
	}
	}
}
	