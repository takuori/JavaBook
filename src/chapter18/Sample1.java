package chapter18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
			var c_list = new ArrayList<Child>();
			c_list.add(new Child());
			c_list.add(new Child());
			
			//Parent型の不変リストをChild型のリストから作成している（境界ワイルドカード型<? extends T>サブクラス型への拡張)
			List<Parent> p_list = List.copyOf(c_list);
			
			//Child型のリストを並び替えるため、Parentクラスのフィールドを指定している。（境界ワイルドカード型<? super E>スーパークラス型への拡張）
			c_list.sort(Comparator.comparing(Parent::key));
			//
		
	}

}
