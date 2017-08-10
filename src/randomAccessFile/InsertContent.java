package randomAccessFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		insert("E:\\JAVA\\Other\\src\\randomAccessFile\\001.txt", 15, "4646646549+");
	}
	public static void insert(String fileName, long pos, String insertContent) 
			throws IOException {
		File tmp = File.createTempFile("tmp", null);
		tmp.deleteOnExit();//程序执行结束后才删除文件
		try (
				RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
				FileOutputStream tmpOut = new FileOutputStream(tmp);
				FileInputStream tmpIn = new FileInputStream(tmp)){
			raf.seek(pos);
			byte[] bbuf = new byte[64];
			int i = 0 ;
			while ((i = raf.read(bbuf)) > 0) {
				tmpOut.write(bbuf,0,i);
			}
			System.out.println(tmpOut);
			raf.seek(pos);
			raf.write(insertContent.getBytes());
			while ((i = tmpIn.read(bbuf)) >0 ) {
				raf.write(bbuf,0,i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
