package Linkedlistpackage;

public class ReverseList extends LinkedList {
	public Node reverse()
	{
		Node cur,temp;
		cur=null;
		if(head==null)
			System.out.println("list is emply cant find any node");
		else if(head.next==null)
			System.out.println("reverse is"+head.data);
		else{
		    while (head!= null)
		    {
		       temp=head;
		       head=head.next;
		       temp.next=cur;
		       cur=temp;
		    }
		    
		}
		return cur;
	}
	void reversedisplay(){
		Node temp=reverse();
		while(temp!=null){
			
		
		System.out.print(temp.data+" \t");
		temp=temp.next;
		}
	}


public static void main(String[] args) {
	
		
		ReverseList l2=new ReverseList();
		l2.addnode_begin(10);
		l2.addnode_begin(8);
		l2.addnode_begin(5);
		l2.addnode_end(20);
		l2.addnode_end(30);
		l2.addnode_begin(2);
		l2.display(); 
		System.out.println("Reverse of the list:");
		l2.reversedisplay();
		
		
}
		
		
		
	}

