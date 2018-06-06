package xyz.un4ckn0wl3z.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 
 * A map contains values on the basis of key i.e. key and value pair. Each key and value pair is known as an entry. Map contains only unique keys.
 Map is useful if you have to search, update or delete elements on the basis of key.
 * 
 * 
 * 
 * 
 * 
 * */

public class JavaMapEx {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
