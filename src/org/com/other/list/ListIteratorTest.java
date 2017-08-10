package org.com.other.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books = {"emilia","ram","jojo"};
		List bookList = new ArrayList();
		for (int i = 0; i < books.length; i++) {
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("----·Ö¸ô·û----");
		}
		System.out.println("=================");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
