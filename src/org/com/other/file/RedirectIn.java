package org.com.other.file;

import java.io.FileInputStream;
import java.util.Scanner;

public class RedirectIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				FileInputStream fis = new FileInputStream("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\out.txt");
				){
			System.setIn(fis);
			Scanner scanner = new Scanner(System.in);
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				System.out.println("asasasasasa"+scanner.next());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
