package Linkedlistpackage;

public class Middlenode extends LinkedList {
    
	public void middlenode(){
		Node ptr1,ptr2;
		
		ptr1=head;
		ptr2=head;
		if(head==null)
			System.out.println("list is emply cant find any node");
		else if(head.next==null)
			System.out.println("middle node is"+head.data);
		else{
			while(ptr2!=null&&ptr2.next!=null){
				ptr1=ptr1.next;
				ptr2=ptr2.next.next;
				
			}
			System.out.println("milddle node of the list is:"+ptr1.data);
		}
	}
	
	 
	public static void main(String[] args) {
	
		
		Middlenode l2=new Middlenode();
		l2.addnode_begin(10);
		l2.addnode_begin(8);
		l2.addnode_begin(5);
		l2.addnode_end(20);
		l2.addnode_end(30);
		l2.addnode_begin(2);
		l2.display();
		l2.middlenode();
	}

}
