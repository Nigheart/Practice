package org.com.other.generic;

public class Apple<T> {
	private T info;
	public Apple(T info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}
	
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple<String> a1 = new Apple<String>("emilia");
		System.out.println(a1.getInfo());
		Apple<Double> a2 = new Apple<Double>(9.31);
		System.out.println(a2.getInfo());
	}

}
interface Iter<e>{
	e next();
	
}