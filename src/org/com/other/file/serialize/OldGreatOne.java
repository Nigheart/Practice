package org.com.other.file.serialize;

import java.io.IOException;
import java.util.ArrayList;

public class OldGreatOne implements java.io.Serializable{
	private String name;
	type t = type.ElderGods;
	private int age;
	//private transient int high;实例变量 序列化 无视
	private int high;
	private int d = 1;
	public OldGreatOne(String name,int age,int high) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.age = age;
		this.high = high;
		if (high % 2 != 0) {
			d = 1;
		}else {
			d = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// TODO Auto-generated method stub
		int aaa = high >> 1;
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
		out.writeInt(aaa);
		out.writeInt(d);
		
	}
	private void readObject(java.io.ObjectInputStream in) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub 反序列化不调用构造器 与copy相似
		this.name = ((StringBuffer)in.readObject()).reverse().toString();
		this.age = in.readInt();
		this.high =in.readInt() << 1;
		this.d = in.readInt();
		this.high+=this.d;
	}
	
	private Object writeReplace() {//自定义机制 序列化返回的对象
		ArrayList<Object> list = new ArrayList<>();
		list.add(name);
		list.add(age);
		list.add(high);
		return list;
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return name;
	}
}
enum type{
	artificial("人造的神"){
		 public void info() {
			System.out.println("这是人造的神");
		}
	},ElderGods("旧神"){
		 public void info() {
			System.out.println("这是旧神");
		}
	},OuterGod("外神"){
		 public void info() {
			System.out.println("这是外神");
		}
	},Incarnation("化身"){
		 public void info() {
			System.out.println("这是化身");
		}
	};
	private final String name;
	private type(String name) {
		this.name = name;
	}
}