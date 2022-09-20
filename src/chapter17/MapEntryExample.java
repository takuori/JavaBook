package chapter17;

import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
	public static void main(String[] args) {
		var map = new HashMap<Integer, String>();
		
		map.put(115, "玉井");
		map.put(120, "百田");
		map.put(130, "高城");
		map.put(140, "佐々木");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
