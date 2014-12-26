package Hashtable_Implementation;

// this will remove all the elements which is occurring more than once
public class RemoveDuplicats {

	public static void main(String[] args) {
		int a[] = { 1, 2,0,0,-2,-2, 3, 3, 4, 4, 5, 5,2,2,4,5,8,6,7,8,6,33,55,44,43,53,63,99,73 };
	//	int a[] = { 3, 33,43,53,63,73 };
		HashTable table = new HashTable();
		for (int elt : a) {
			table.insert(elt);

		}
		System.out.println(table.tabletoarray());
	}

}
