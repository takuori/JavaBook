package chapter16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//左辺の変数はArrayList型ではなく、List型にするのが普通。
		//こうすることで将来使用するクラスの変更が容易になる
		
		//var list = ArrayList<String>(); と宣言する形でもOK
		
		list.add("玉井詩織"); //文字列の追加
		list.add("百田夏菜子");
		list.add("佐々木彩夏");
		list.add("高城れに");
		
		//拡張for文 listから要素を順に取り出してlsに代入
		for(String ls : list) {
			System.out.println(ls);
		}
		
		//最近はこの方法がよく使われる。短くかける。
		list.forEach(System.out::println);
	}

}
