package xyz.un4ckn0wl3z.collections.linkedhasset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 
 * The important points about Java LinkedHashSet class are:
 * Contains unique elements only like HashSet.
 * Provides all optional set operations, and permits null elements.
 * Maintains insertion order.

 * 
 * */

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(null);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
