package chapter20;

import java.util.List;

public class FilterExample {
	public static void main(String[] args) {
		var list = PC.getList();

		list.stream()
				.filter(pc -> "Panan".equals(pc.maker()))
				.forEach(System.out::println);
        
		//終端操作で新しいリストを作成
		List<PC> maker_panan = list.stream()
				.filter(pc -> "Panan".equals(pc.maker()))
				.toList();
		        //不変リストになる
		
		System.out.println(maker_panan); //確認
	}

}
