package chapter20;

import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		var list = PC.getList();
		
	    List<String> makers = list.stream()
	    		                  .map(PC::maker) //引数のラムダ式が返す値をストリームに出力するメソッド
	    		                  .distinct()
	    		                  .toList();

		makers.forEach(name -> System.out.print(name + " "));
	}

}
