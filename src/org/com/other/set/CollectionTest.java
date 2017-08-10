package org.com.other.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("emilia");
		c.add(6);
		System.out.println(c.size());
		c.remove(6);
		System.out.println(c.size());
		System.out.println(c.contains("emilia"));
		c.add("chollte");
		c.add("emilia");
		c.add("ram");
		System.out.println(c);
		Collection books = new HashSet();
		books.add("chollte");
		books.add("emilia");
		books.add("emilia");
		System.out.println(c.containsAll(books));
		c.removeAll(books);
		System.out.println(c);
		books.retainAll(c);
		System.out.println(books);
		
	}
}
