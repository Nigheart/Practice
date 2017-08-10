package org.com.other;

import java.awt.SystemColor;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class ReferenceTest {//≤Œ’’
	public static void main(String[] args) {
		String str = new String("emilia£°");
		ReferenceQueue rq = new ReferenceQueue();
		WeakReference wr = new WeakReference(str);
		PhantomReference pr = new PhantomReference(str, rq);
		str = null;
		System.out.println(pr.get());
		System.gc();
		System.runFinalization();
		System.out.println(rq.poll() == pr);
	}

}
