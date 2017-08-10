package org.com.other.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class PrintStreamTest {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fis = new FileOutputStream("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\PrintStreamTest.txt");
		PrintStream ps = new PrintStream(fis);
		ps.print("Ö±½ÓÊä³ö");
		ps.print(new PrintStreamTest());
	}

}
