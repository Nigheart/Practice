package org.com.other.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class WriteToProcess {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process p = Runtime.getRuntime().exec("java ReadStandard");
		try (
				PrintStream ps = new PrintStream(p.getOutputStream())){
			ps.print("普通字符串") ;
			ps.println(new WriteToProcess() );
		} catch (Exception e) {
			// TODO: handle exception
		}
				
	}

}
class ReadStandard{
	public static void main(String[] args) {
		try (
				Scanner scanner = new Scanner(System.in);
				PrintStream ps = new PrintStream(
						new FileOutputStream("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\001.txt"))){
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				ps.println("键盘上输入的内容是"+scanner.next());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
