package org.com.other.queue;

import java.util.ArrayDeque;

public class ArrayDequeStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque stack = new ArrayDeque();
		stack.push("emilia");
		stack.push("rom");
		stack.push("ram");
		stack.push("jojo");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}

}
