package org.com.other.file;

import java.io.FileReader;
import java.io.PushbackReader;

public class PushbackTest {

	/**
	 * ������Ҫ����ѧϰ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(PushbackReader pr = new PushbackReader(
				new FileReader("E:\\JAVA\\Other\\src\\org\\com\\other\\file\\PushbackTest.java"),64)
		//����һ��pushbackreader�����˻ػ���������Ϊ64 
		) {
			char[] buf = new char[32];
			String lastContect = "";
			//�����ϴζ�д���ַ���
			int hasRead = 0;
			//ѭ����ȡ�ļ�����
			while ((hasRead = pr.read(buf)) > 0) {
				String context = new String(buf, 0, hasRead);
				//��ȡ����ת��Ϊ�ַ���
				int TargetIndex = 0;
				if ((TargetIndex = (lastContect + context).indexOf("new PushbackReader")) > 0) {
					pr.unread((lastContect+context).toCharArray());
					
					if (TargetIndex > 32 ) {
						buf = new char[TargetIndex];
					}
					pr.read(buf, 0, TargetIndex);
					System.out.print(new String (buf,0,TargetIndex));
					System.exit(0);
				}
				else {
					System.out.print(lastContect);
					lastContect =context;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
