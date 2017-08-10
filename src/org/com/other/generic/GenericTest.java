package org.com.other.generic;

import java.util.Collection;

public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class box<T>{
	T t;
	public <E> box(E e,T t) {
		
		System.out.println(e);
	}
}
class box1<T>{
	T t;
	public <E extends T> box1(E e,T t) {
		
		System.out.println(e);
	}
	public <A> A box2(Collection<? extends A> a, Collection<A> b) {
		return null;
	}
}