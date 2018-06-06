package xyz.un4ckn0wl3z.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 
 * The important points about Java HashMap class are:

 A HashMap contains values based on the key.
 It contains only unique elements.
 It may have one null key and multiple null values.
 It maintains no order.

 * Let's see the Parameters for java.util.HashMap class.

 K: It is the type of keys maintained by this map.
 V: It is the type of mapped values.

 * 
 * */

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (@SuppressWarnings("rawtypes") Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Remove value for key 102
		hm.remove(102);
		System.out.println("Values after remove: " + hm);
		
		// HashSet contains only values whereas HashMap contains entry(key and value).

	}

}
