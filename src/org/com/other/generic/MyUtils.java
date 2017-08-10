package org.com.other.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUtils {
	public static <T> T copy(Collection<? super T> dest,Collection<T> src) {
		T last = null;
		for (T t : src) {
			last = t;
			dest.add(t);
		}
		return last;
	}
	/*public static <T> MyUtils<T> box() {
		return null;
	}*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		Integer last = copy(ln, li);
		System.out.println(ln );
		
		List<String>[] lsa = new ArrayList[10];
		Object[] oa = lsa;
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(new Integer(3));
		oa[1] = li1;
		String string = lsa[1].get(0);
		
		
	}

}
