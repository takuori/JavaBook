package chapter17;

import java.util.HashMap;

public class MapOperation {
	public static void main(String[] args) {
		var map = new HashMap<Integer, String>();
		map.put(115, "玉井");
		map.put(120, "百田");
		map.put(108, "佐々木");
		map.put(115, "高城");
		
		System.out.println(map.get(115));
		System.out.println(map.get(200));
		System.out.println(map.getOrDefault(200, "***"));
	}

}
