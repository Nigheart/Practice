package org.com.other.file;

import java.io.FileOutputStream;
import java.io.PrintStream;
//import com.sun.org.apache.bcel.internal.generic.NEW;

public class RedirectOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(PrintStream ps = new PrintStream(new FileOutputStream("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\out.txt"));
			PrintStream out = System.out;//�ض�����֮��System.out���Ѿ����ض���֮������ġ��ڶ��ζ���û������,������Ҫ���������
		) {
			System.setOut(ps);
			System.out.println("��ͨ�ַ���");
			System.out.println(new RedirectOut());
			System.setOut(out);
			System.out.println("==========");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
