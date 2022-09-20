package chapter17;

import java.util.HashMap;
import java.util.Map;

public class Fruits {
	public static void main(String[] args) {
		var map = new HashMap<String, String>();
		
		map.put("cherry", "チェリー");
		map.put("apple", "リンゴ");
		map.put("pear", "ナシ");
		map.put("banana", "バナナ");
		map.put("grape", "ブドウ");
		
		for(Map.Entry<String, String> fru : map.entrySet()) {
			System.out.println(fru.getKey() + " - " + fru.getValue());
		}
		
		System.out.println("banana:" + map.get("banana"));
		System.out.println("pineapple:" + map.getOrDefault("pineapple", "フルーツ"));
	}

}
