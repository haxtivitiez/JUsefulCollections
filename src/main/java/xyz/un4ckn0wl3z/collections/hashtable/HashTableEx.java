package xyz.un4ckn0wl3z.collections.hashtable;

import java.util.Hashtable;
import java.util.Map;

/*
 * 
 * The important points about Java Hashtable class are:

 A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
 It contains only unique elements.
 It may have not have any null key or value.
 It is synchronized.

 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
