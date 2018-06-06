package xyz.un4ckn0wl3z.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeOperation {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai");
		System.out.println("After offerFirst Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}

		deque.pollLast();
		System.out.println("After pollLast() Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}

	}

}
