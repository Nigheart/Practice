package org.com.other;

public class Two {
	public static void main(String[] args) {
		String x ="10111111£¬10110100£¬11000000£¬10110100£¬11000100£¬11100011£¬11010000£¬11101000£¬11010010£¬10101010£¬11010010£¬10111011£¬10110101£¬11100011£¬10110101£¬11100011£¬10110101£¬11000100£¬10110101£¬11110111£¬10111101£¬11001100£¬11000100£¬11011000£¬10100001£¬10100011";
		String[] split = x.split("£¬");
		int[] y = new int[split.length];
		int[] z = new int[split.length];
		int[] w = new int[split.length];
		System.out.println(split[1]);
		for (int i = 0; i < split.length; i++) {
			y[i] = Integer.parseInt(split[i], 2);
			System.out.println(y[i]);
		}
		
	}
}
