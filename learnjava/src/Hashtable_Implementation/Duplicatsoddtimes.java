package Hashtable_Implementation;

public class Duplicatsoddtimes {

	
	public static void main(String[] args) {
		int a[]={1,1,2,2,2,3,3,4,4,4,2,1,2};
		HashTable table = new HashTable();
		for (int elt : a) {
			table.inserteventimes(elt);

		}
		System.out.println(table.tabletoarray());
	}

}
