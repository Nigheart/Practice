package org.com.other.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class KeyinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (InputStreamReader reader = new InputStreamReader(System.in);//try(A){B}A内放要自动释放的资源
				BufferedReader br = new BufferedReader(reader)){
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.equals("exit")) {
					System.exit(1);
				}
				System.out.println("输入内容为："+ line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
