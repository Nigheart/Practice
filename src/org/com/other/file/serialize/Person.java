package org.com.other.file.serialize;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements java.io.Externalizable{
	private String name;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name,int age) {
		System.out.println("有参构造器");
		this.name = name;
		this.age = age;
	}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	
}

@Override
public void readExternal(ObjectInput in) throws IOException,
		ClassNotFoundException {
	// TODO Auto-generated method stub
	
}

}
