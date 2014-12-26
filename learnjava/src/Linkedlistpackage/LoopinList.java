package Linkedlistpackage;

public class LoopinList extends LinkedList{

	public boolean loop(){
		Node slow,fast;
		slow=fast=head;
		do{
			slow=slow.next;
			if(fast==null||fast.next==null)
				return false;
			fast=fast.next.next;
		}while(slow!=fast);
			return true;
	}
	public static void main(String[] args) {
		LoopinList l2=new LoopinList();
		l2.addnode_begin(10);
		l2.addnode_begin(8);
		l2.addnode_begin(5);
		l2.addnode_end(20);
		l2.addnode_end(30);
		l2.addnode_begin(2);
		l2.addnode_end(40);
		l2.display();

	}

}
