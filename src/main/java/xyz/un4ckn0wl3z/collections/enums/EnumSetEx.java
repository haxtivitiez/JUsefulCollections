package xyz.un4ckn0wl3z.collections.enums;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 
 * 
 * Java EnumSet class is the specialized Set implementation for use with enum types. 
 * It inherits AbstractSet class and implements the Set interface.
 * 
 * 
 * */

public class EnumSetEx {

	enum days {

		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {

		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

		// Traversing elements
		Iterator<days> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());

		}

		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("Week Days:" + set1);

		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week Days:" + set2);

	}

}
