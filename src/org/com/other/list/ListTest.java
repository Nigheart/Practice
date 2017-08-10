package org.com.other.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add(new String("emilia"));
		books.add("ram");
		books.add("rom");
		books.add(new String("ram"));
		System.out.println(books);
		books.add(1,"dio");
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		System.out.println(books.indexOf("ram"));//判断通过equals相等
		books.set(2, "jojo");
		System.out.println(books);
		System.out.println(books.subList(1, 2));
		
	}

}
