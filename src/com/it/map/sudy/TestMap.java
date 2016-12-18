package com.it.map.sudy;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ¼üÖµ¶Ô
		Map map = new HashMap();
		map.put("name", "zs");
		map.put("sex", "boy");
		map.put("name", "ls");
		
		
		System.out.println(map.get("name"));
	}

}
