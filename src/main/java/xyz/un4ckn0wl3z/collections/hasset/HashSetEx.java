package xyz.un4ckn0wl3z.collections.hasset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	/*
	 * 
	 * The important points about Java HashSet class are: HashSet stores the
	 * elements by using a mechanism called hashing.
	 * 
	 * Difference between List and Set List can contain duplicate elements
	 * whereas Set contains unique elements only.
	 */

	public static void main(String[] args) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();

		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add(null);
		
		 //Traversing elements  
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());		
		}
		
		/*
		 * OUTPUT: 
		 * Vijay
		 * Ravi
		 * Ajay
		 * 
		 * */
		
		
	}

}
