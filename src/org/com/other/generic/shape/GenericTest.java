package org.com.other.generic.shape;

public class GenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Double> name = new Box<>(3.14);
		Box<Integer> innt = new Box<>(111);
		Box<Number> num = new Box<Number>(314);
		Box<String> strBox = new Box<>("emilia");
		getData(num);
		getData(innt);
		getData(name);
		getUpperNumberData(num);
		int i = 1;
		//int x = i+++i++;
		int y = ++i+i++;
		System.out.println(" "+y);

	}
	public static void getData(Box<?> data) {
		System.out.println(data.getData());
	}
	public static void getUpperNumberData(Box<? extends Number> data){
        System.out.println("data :" + data.getData());
	}
}

class Box<T> {
	private T data;
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public Box(T data){
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}