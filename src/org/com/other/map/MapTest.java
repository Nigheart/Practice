package org.com.other.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("emilia", 16);
		map.put("ram", 16);
		map.put("zima", 17);
		System.out.println(map);
		System.out.println(map.put("zima", 999999));
		System.out.println("ÊÇ·ñ°üº¬emilia"+map.containsKey("emilia"));
		for(Object key : map.keySet()){
			System.out.println(key + "-->" + map.get(key));
		}
		map.remove("ram");
		System.out.println(map);
		
	}

}
