package org.com.other.set;

import java.util.TreeSet;

public class TreeSetTest {//不是根据插入顺序排序 根据元素实际值大小
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(5);
		ts.add(2);
		ts.add(10);
		ts.add(-9);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(4));
		System.out.println(ts.tailSet(5));
		System.out.println(ts.subSet(-3, 4));
	}
}
