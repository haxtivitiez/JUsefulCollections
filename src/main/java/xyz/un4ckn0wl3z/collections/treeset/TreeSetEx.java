package xyz.un4ckn0wl3z.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 
 * The important points about Java TreeSet class are:
 * Contains unique elements only like HashSet.
 * Access and retrieval times are quiet fast.
 * Maintains ascending order.
 * 
 * 
 * */

public class TreeSetEx {

	public static void main(String[] args) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();

		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
