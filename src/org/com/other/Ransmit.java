package org.com.other;

public class Ransmit {
	static String s1 = "emilia";
	static String s2 = "Ram";
	static String[] arrayA = {"01","02","03","04","05"};
	String[] arrayB = new String[5];
	public static void main(String[] args){
		exchange(s1, s2);
		System.out.println(s1+"+++"+s2);
		ArrayExchange(1, 3);
		System.out.println(arrayA[1]+"      "+arrayA[3]);
	}
	public static void exchange(String S1,String S2) {
		String tem = S1;
		S1 = S2;
		S2 = tem;
	}
	public static void ArrayExchange(int s1,int s2) {
		String tem = arrayA[s1];
		arrayA[s1] = arrayA[s2];
		arrayA[s2] = tem;
	}
}
