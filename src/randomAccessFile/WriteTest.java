package randomAccessFile;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class WriteTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fl = new FileOutputStream("E:\\JAVA\\Other\\src\\randomAccessFile\\001.txt");
		PrintStream ps = new PrintStream(fl);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1024; i++) {
			sb.append(i+" ");
		}
		ps.print(sb.toString());
		fl.close();
		ps.close();
	}

}
