package xyz.un4ckn0wl3z.collections.list;

import java.util.ArrayList;

/*
 * 
 * 
 * 
 * List Interface is the subinterface of 
 * Collection.It contains methods to insert and delete 
 * elements in index basis.It is a factory of ListIterator interface. 
 * 
 * 
 * 
 * 
 * */

public class ListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1, "Sachin");
		System.out.println("Element at 2nd position: " + al.get(2));
		for (String s : al) {
			System.out.println(s);
		}

	}

}
