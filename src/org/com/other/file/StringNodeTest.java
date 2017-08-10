package org.com.other.file;

import java.io.StringReader;
import java.io.StringWriter;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class StringNodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "111111111111111\n"+"222222222222222222\n"+"333333333333333333\n";
		char[] buffer = new char[32];
		int hasRead = 0;
		try (StringReader sr = new StringReader(src)){
			while ((hasRead = sr.read(buffer)) > 0) {
				System.out.println(new String(buffer, 0, hasRead) );
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try (StringWriter sw = new StringWriter()){
			sw.write("我有一个梦想，\n");
			sw.write("看见不可视的东西，\n");
			sw.write("如果有她可以拯救我的灵魂，\n");
			sw.write("我愿意献出我的一切，\n");
			sw.write("非人，也可以。\n");
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
