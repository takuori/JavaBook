package chapter17;

import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		var ids = new TreeSet<String>();
		ids.add("玉井詩織");
		ids.add("百田夏菜子");
		ids.add("佐々木彩夏");
		ids.add("高城れに");
		ids.add("玉井詩織");
		
		for(String e : ids) {
			System.out.println(e);
		}
	}

}
