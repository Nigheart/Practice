package org.com.other;

public class EnumTest {
	public void judge(SeasonEnum s) {
		switch (s) {
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case FALL:
			System.out.println("����");
			break;
		case WINTER:
			System.out.println("����");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}
		new EnumTest().judge(SeasonEnum.SPRING);
		SeasonEnum se = SeasonEnum.valueOf("SPRING");
		System.out.println(se.toString()+"  "+se.name());
	}
}
