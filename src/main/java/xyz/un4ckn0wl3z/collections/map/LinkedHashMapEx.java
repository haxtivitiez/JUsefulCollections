package xyz.un4ckn0wl3z.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 
 * Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.

 The important points about Java LinkedHashMap class are:

 A LinkedHashMap contains values based on the key.
 It contains only unique elements.
 It may have one null key and multiple null values.
 It is same as HashMap instead maintains insertion order.

 * 
 * 
 * 
 * 
 * */

public class LinkedHashMapEx {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (@SuppressWarnings("rawtypes")
		Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Remove value for key 102
		hm.remove(102);
		System.out.println("Values after remove: " + hm);

	}

}
