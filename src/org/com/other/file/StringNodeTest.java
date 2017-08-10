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
			sw.write("����һ�����룬\n");
			sw.write("���������ӵĶ�����\n");
			sw.write("����������������ҵ���꣬\n");
			sw.write("��Ը���׳��ҵ�һ�У�\n");
			sw.write("���ˣ�Ҳ���ԡ�\n");
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
