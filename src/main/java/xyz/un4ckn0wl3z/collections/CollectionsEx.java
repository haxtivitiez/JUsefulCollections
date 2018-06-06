package xyz.un4ckn0wl3z.collections;

/*
 * 
 * Java collection class is used exclusively with static methods that operate on or return collections. It inherits Object class.

 The important points about Java Collections class are:

 Java Collection class supports the polymorphic algorithms that operate on collections.
 Java Collection class throws a NullPointerException if the collections or class objects provided to them are null.

 * 
 * 
 * 
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("C");
		list.add("Core Java");
		list.add("Advance Java");
		System.out.println("Initial collection value:" + list);
		Collections.addAll(list, "Servlet", "JSP");
		System.out.println("After adding elements collection value:" + list);
		String[] strArr = { "C#", ".Net" };
		Collections.addAll(list, strArr);
		System.out.println("After adding array collection value:" + list);

		List<Integer> listMax = new ArrayList<Integer>();
		listMax.add(46);
		listMax.add(67);
		listMax.add(24);
		listMax.add(16);
		listMax.add(8);
		listMax.add(12);
		System.out.println("Value of maximum element from the collection: "
				+ Collections.max(listMax));

		System.out.println("Value of minimum element from the collection: "
				+ Collections.min(listMax));

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");

		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList alWrapp = new ArrayList();
		alWrapp.add(Integer.valueOf(201));
		alWrapp.add(Integer.valueOf(101));
		alWrapp.add(230);// internally will be converted into objects as
							// Integer.valueOf(230)

		Collections.sort(alWrapp);

		Iterator itrWrap = alWrapp.iterator();
		while (itrWrap.hasNext()) {
			System.out.println(itrWrap.next());
		}

	}

}
