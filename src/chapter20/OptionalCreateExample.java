package chapter20;

import java.util.Optional;

record Book(String title, String author) {}

public class OptionalCreateExample {
	public static void main(String[] args) {
		
		Optional<Book> op1 = Optional.empty();                               //空のOptionalインスタンスを作成
		Optional<Book> op2 = Optional.of(new Book("夏目漱石", "坊ちゃん"));  //nullでない値を指定してOptionalインスタンスを作成する
		Book book = null;                                                    
		Optional<Book> op3 = Optional.ofNullable(book);                    //of()と同じだが、nullの場合は空のインスタンスを作成する
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		
	}

}
