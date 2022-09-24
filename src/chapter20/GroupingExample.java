package chapter20;

import static java.util.stream.Collectors.*; //スタティックインポート

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class GroupingExample {
	public static void main(String[] args) {
		TreeSet<PC> list = PC.getList();

		Map<String, List<String>> typeGroup = list.stream()
				.collect(groupingBy(PC::type, mapping(PC::name, toList()))); //二次操作

		typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
		//Mapインターフェースのデフォルトメソッド
		//引数のラムダ式はBiConsumer 型で関数記述子は(k,v)-> voidになる。
		
		System.out.println("------------------------------------");
		
		Map<Boolean, List<String>> typeGroup2 = list.stream()
				.collect(partitioningBy(pc -> pc.price() > 60000,
						mapping(PC::name,toList())));
		
		typeGroup2.forEach((k, v) -> System.out.println(k + " = " + v));
				
	}

}
