package org.com.other;

import java.security.PublicKey;

public class Other extends HelloA {
	public Other(){
		System.out.println("HelloB");
	}
	{
		System.out.println("I'm B class");
	}
	static{
		System.out.println("static B");
	}
	public static void main(String[] args){
		System.out.println("---main start---");
		new Other();
		System.out.println("---main   end---");
	}
}
class HelloA{
	public HelloA() {
		System.out.println("HelloA");
	}
	{
		System.out.println("I'm A class");
	}
	static{
		System.out.println("static A");
	}
}