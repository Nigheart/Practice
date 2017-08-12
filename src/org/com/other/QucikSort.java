package org.com.other;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import com.sun.accessibility.internal.resources.accessibility;

public class QucikSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		QucikSort qs = new QucikSort();
		int[] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(50);
		}
		pr(m);
		qs.merge(m, 0, m.length-1);
		pr(m);
	}
	public static void pr(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println();
	}
	/*public <T> void exchange(List<T> m,int a,int b) {
		T tmp = m.get(a);
		m.set(a, m.get(b));
		m.set(b, tmp);
	}
	public <T> Integer compare(List<T> m,int a, int b) {
		if (m.get(a).toString(). > m.get(b).toString().getBytes()) {
			
		}
		return null;
		
	}*/
	public void exchange(int[] m,int a,int b) {
		int tmp = m[a];
		m[a] = m[b];
		m[b]= tmp;
	}
	public int per(int[] m,int i, int j) {
		System.out.println("sort(m,"+i+","+j+")");
		pr(m);
		int key = m[i];
		int hi = j;
		int lo = i;
		while (true) {
			while (lo<hi) {
				if (m[hi] >= key) hi--;
				else{exchange(m, lo, hi);
					break;
				}
			}
			while (lo<hi){
				if (m[lo] <= key) lo++;
				else {exchange(m, lo, hi);
					break;
				}
			}
			
			if (lo >= hi) break;
		}
		return hi;
	}
	public void merge(int[] m,int lo,int hi) {
		
		if (lo >= hi ) {
			return;
		}
		System.out.println("merge(m,"+lo+","+hi+")");
		int i = per(m, lo, hi);
		merge(m, lo, i-1);
		merge(m, i+1, hi);
	}
}
