package Hashtable_Implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable {

	
	List<LinkedList<Integer>> table;
	public HashTable() {
		table = new ArrayList<LinkedList<Integer>>();
		for (int i=0;i<10;i++){
			table.add(new LinkedList<Integer>());
		}
		
	}

	int getHashCode(int a) {
		return Math.abs(a) % 10;
	}

	void insert(int a) {
		int pos = getHashCode(a);
		LinkedList<Integer> LLtoInsert = table.get(pos);
		if (!LLtoInsert.contains(a)) {
			LLtoInsert.add(a);
		}
	}
	//insert function when each element occurs even times except 2 element
	void inserteventimes(int a) {
		int pos = getHashCode(a);
		LinkedList<Integer> LLtoInsert = table.get(pos);
		if (LLtoInsert.contains(a)) {
			table.remove(pos);
		}
		else{
			LLtoInsert.add(a);
		}
	}

	boolean search(int a) {
		int pos = getHashCode(a);
		LinkedList<Integer> LLtoSearch = table.get(pos);
		return LLtoSearch.contains(a);

	}

	public boolean deleteHashelt(int a) {
		int pos = getHashCode(a);
		LinkedList<Integer> LLtodelete = table.get(pos);
		if (!LLtodelete.contains(a)) {
			return false;
		} else {
			LLtodelete.remove(a);
			return true;
		}
	}

	List<Integer> tabletoarray() {
		List<Integer> toarray = new ArrayList<Integer>();
		for (LinkedList<Integer> LL : table) {
			for (Integer elt : LL) {
				
				toarray.add(elt);
			}
		}
		return toarray;
	}
}
