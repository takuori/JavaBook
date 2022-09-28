package chapter24;

import java.util.List;

public class EnumExample {
	public static void main(String[] args) {
		var list = List.of(
				new SmartPhone("100", Color.WHITE),
				new SmartPhone("101", Color.BLACK),
				new SmartPhone("102", Color.BLACK),
				new SmartPhone("103", Color.GOLD));
		
		list.forEach(System.out::println);
		
		//色がColor.BLACKだけのものを抽出
		list.stream()
		    .filter(s -> s.color() == Color.BLACK)
		    .forEach(System.out::println);
		
	}

}
