package xyz.un4ckn0wl3z.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	/*
	 * The important points about Java LinkedList are: Java LinkedList class can
	 * contain duplicate elements. Java LinkedList class maintains insertion
	 * order. Java LinkedList class is non synchronized. In Java LinkedList
	 * class, manipulation is fast because no shifting needs to be occurred.
	 * Java LinkedList class can be used as list, stack or queue.
	 */

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
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
