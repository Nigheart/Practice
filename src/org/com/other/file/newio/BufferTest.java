package org.com.other.file.newio;

import java.nio.CharBuffer;
import javax.swing.text.Position;

public class BufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharBuffer buffer = CharBuffer.allocate(8);
		System.out.println(buffer.capacity());//容量	
		System.out.println(buffer.limit());//界限
		System.out.println(buffer.position());//位置
		buffer.put('a');
		buffer.put('b');
		buffer.put('c');
		buffer.put('d');
		System.out.println("CAP:"+buffer.capacity()+" LIM:"+buffer.limit()+" POS"+buffer.position()+" BUF"+buffer);
		buffer.flip();
		System.out.println("CAP:"+buffer.capacity()+" LIM:"+buffer.limit()+" POS"+buffer.position()+" BUF"+buffer);
		buffer.put('A');
		System.out.println("CAP:"+buffer.capacity()+" LIM:"+buffer.limit()+" POS"+buffer.position()+" BUF"+buffer);
		System.out.println(buffer.get());
		System.out.println(buffer.get());
		System.out.println(buffer.get());
		System.out.println("CAP:"+buffer.capacity()+" LIM:"+buffer.limit()+" POS"+buffer.position()+" BUF"+buffer);
		buffer.flip();
		System.out.println("CAP:"+buffer.capacity()+" LIM:"+buffer.limit()+" POS"+buffer.position()+" BUF"+buffer);
		
		
	}

}
