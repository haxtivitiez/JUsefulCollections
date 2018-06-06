package xyz.un4ckn0wl3z.collections.comparatorzGeneric;

import java.util.Comparator;

public class NameComparatorGen implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}
