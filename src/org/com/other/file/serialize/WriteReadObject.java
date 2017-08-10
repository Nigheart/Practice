package org.com.other.file.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write();
		Read();
	}
	public static void write() {
		try (
				ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream("E:\\JAVA\\Other\\src\\randomAccessFile\\002.txt"))){
			OldGreatOne nyaruko = new OldGreatOne("nyaruko", 99999, 9);
			oos.writeObject(nyaruko);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void Read() {
		try (
				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("E:\\JAVA\\Other\\src\\randomAccessFile\\002.txt"))){
			OldGreatOne oldGreatOne = (OldGreatOne)ois.readObject();
			System.out.println("Ãû×ÖÎª"+oldGreatOne.getName()+" " +oldGreatOne.getAge()+" " +oldGreatOne.getHigh());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
