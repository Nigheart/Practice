package org.com.other;

public class FinaLizeTest {
	private static FinaLizeTest ft = null;
	public void info() {
		System.out.println("������Դ�����finalize����");
	}
	public static void main(String[] args) {
		new FinaLizeTest();
		//System.gc();
		Runtime.getRuntime().runFinalization();
		System.runFinalization();
		ft.info();
	}
	public void finalize() {
		ft = this;
	}
}
