package org.com.other.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadFromProcess rf = new ReadFromProcess();
		rf.out();
		Process p = Runtime.getRuntime().exec("javac");
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(p.getErrorStream()))){
			String buff = null;
			while ((buff = br.readLine()) != null) {
				System.out.println(buff);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void out() throws IOException {
		Process p = Runtime.getRuntime().exec("javac E:\\JAVA\\Other\\src\\org\\com\\other\\file\\FileTest.java");
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(p.getInputStream()))){
			String buff = null;
			while ((buff = br.readLine()) != null) {
				System.out.println(buff);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
