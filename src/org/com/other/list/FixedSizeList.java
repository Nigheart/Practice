package org.com.other.list;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List fixedList = Arrays.asList("emilia","jojo");
		System.out.println(fixedList.getClass());
		System.out.println(fixedList);
		//fixedList.forEach(System.out::println);
		//fixedList.add("rom");//长度固定 无法添加删除
	}

}
