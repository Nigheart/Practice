package org.com.other.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("F:\\p站");
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("新对象是否存在："+ newFile.exists());
		System.out.println(newFile.createNewFile());
		System.out.println(newFile.mkdir());
		String[] fileList = f.list();
		System.out.println("===当前路径的文件===");
		for (String s : fileList) {
			System.out.println(s);
		}
		System.out.println("===系统根路径===");
		File[] fileRoot = File.listRoots();
		for (File file : fileRoot) {
			System.out.println(file);
		}
	}

}
