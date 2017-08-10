package org.com.other.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet b = new LinkedHashSet();
		b.add("emilia");
		b.add("ram");
		System.out.println(b);
		b.remove("emilia");
		b.add("emilia");
		System.out.println(b);
		
	}
}
