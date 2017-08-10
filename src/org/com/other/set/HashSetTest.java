package org.com.other.set;

import java.util.HashSet;
import java.util.Iterator;

class R{
	int count;
	public R(int count){
		this.count = count;
	}
	public String toString() {
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode() {
		return this.count;
	}
}
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		System.out.println(hs);
		Iterator it = hs.iterator();
		R first = (R)it.next();
		first.count = -3;
		System.out.println(hs);
		hs.remove(new R(-3));
		System.out.println(hs);
		System.out.println("-3"+ hs.contains(new R(-3)));

		System.out.println("-2"+ hs.contains(new R(-2)));
	}

}
