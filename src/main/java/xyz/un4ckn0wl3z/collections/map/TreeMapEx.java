package xyz.un4ckn0wl3z.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	/*
	 * 
	 * Java TreeMap class implements the Map interface by using a tree. It
	 * provides an efficient means of storing key/value pairs in sorted order.
	 * 
	 * The important points about Java TreeMap class are:
	 * 
	 * A TreeMap contains values based on the key. It implements the
	 * NavigableMap interface and extends AbstractMap class. It contains only
	 * unique elements. It cannot have null key but can have multiple null
	 * values. It is same as HashMap instead maintains ascending order.
	 */

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
