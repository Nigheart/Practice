package randomAccessFile;

import java.io.RandomAccessFile;


public class RandomAccessFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (RandomAccessFile raf = new RandomAccessFile("E:\\JAVA\\Other\\src\\randomAccessFile\\001.txt","rw")){
			System.out.println("指针的初始位置："+raf.getFilePointer());
			raf.seek(16);
			byte[] bbuf = new byte[1024];
			int i = 0;
			while ((i = raf.read(bbuf)) > 0) {
				System.out.println(new String (bbuf,0,i) );
			}
			raf.seek(raf.length());
			raf.write("追加的内容！！！！".getBytes());//不能插入内容
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
