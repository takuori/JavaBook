package chapter20;

import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		var fruits = List.of("banana", "peach", "apple", "strawberry");
		    fruits.stream() //Listからストリームを作成する処理
		          .sorted() //受け取った要素を並び替える処理
		          .forEach(System.out::println); //受け取った要素にラムダ式で指定したアクションを適用。ここでは要素をコンソールに出力するようにしている。
	}

}
