package org.com.other;

import java.util.Random;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(randomString(-229985452)+' '+randomString(-147909649));
	}
	
	public static String randomString(int seed) {
		Random random = new Random(seed);
		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = random.nextInt(27);
			if (n == 0){
				break;
			}
			sb.append((char)('`'+n));
		}
		return sb.toString();
	}

}
