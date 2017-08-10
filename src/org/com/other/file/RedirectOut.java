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
			PrintStream out = System.out;//重定向了之后System.out就已经是重定向之后的流的。第二次定向没有意义,所以需要保存输出流
		) {
			System.setOut(ps);
			System.out.println("普通字符串");
			System.out.println(new RedirectOut());
			System.setOut(out);
			System.out.println("==========");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
