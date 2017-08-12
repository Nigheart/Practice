package org.com.other.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class FileInputStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStreamTest fff = new FileInputStreamTest();
		fff.InputStreamFile();
		fff.ReaderFile();
		
	}
	public void InputStreamFile() throws IOException {
		FileInputStream fis = new FileInputStream("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\FileInputStreamTest.java");
		FileOutputStream fos = new FileOutputStream("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\FileInputStreamTest.txt");
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(bbuf)) > 0) {
			System.out.println(new String(bbuf,0,hasRead));
			fos.write(bbuf, 0, hasRead);
		}
		
		fis.close();
		fos.close();
	}
	
	public void ReaderFile() throws IOException {
		FileReader r = new FileReader("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\FileTest.java");
		FileWriter writer = new FileWriter("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\FileTest.txt");
		char[] cbuf = new char[32];
		int hasRead = 0;
		while ((hasRead = r.read(cbuf)) > 0) {
			writer.write(cbuf,0,hasRead);
		}
		r.close();
		writer.close();
	}

}
