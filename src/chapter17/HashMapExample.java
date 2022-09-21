package chapter17;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		var map = new HashMap<Integer, String>();
		map.put(115, "玉井");
		map.put(108, "百田");
		map.put(105, "佐々木");
		
		System.out.println(map.get(108));
		
	}

}
