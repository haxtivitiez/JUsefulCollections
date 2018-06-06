package xyz.un4ckn0wl3z.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBook {

	public static void main(String[] args) {

		Map<Integer, Book> map = new HashMap<Integer, Book>();

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan",
				"Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		// Traversing map

		for (Map.Entry<Integer, Book> mb : map.entrySet()) {
			int key = mb.getKey();
			Book b = mb.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " "
					+ b.publisher + " " + b.quantity);

		}

	}

}
