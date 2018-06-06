package xyz.un4ckn0wl3z.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	/*
	 * 
	 * The important points about Java ArrayList class are: Java ArrayList class
	 * can contain duplicate elements. Java ArrayList class maintains insertion
	 * order. Java ArrayList class is non synchronized. Java ArrayList allows
	 * random access because array works at the index basis. In Java ArrayList
	 * class, manipulation is slow because a lot of shifting needs to be
	 * occurred if any element is removed from the array list.
	 */

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");// Adding object in arraylist
		list.add("B");
		list.add("C");
		list.add("D");

		// Traversing list through Iterator
		System.out.println("Iterator : ");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// For-Each
		System.out.println("For-Each : ");
		for(String obj:list) { 
		    System.out.println(obj);  
		 }  
		

	}

}
