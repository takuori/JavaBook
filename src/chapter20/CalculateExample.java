package chapter20;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.TreeSet;

public class CalculateExample {
	public static void main(String[] args) {
		TreeSet<PC> list = PC.getList();
		
		//件数
		long count = list.stream().count();
		
		//合計
		int sum = list.stream()
				.mapToInt(PC::price)
				.sum();
		
		OptionalDouble ave = list.stream()
				.mapToInt(PC::price)
				.average();
		
		OptionalInt max = list.stream()
				.mapToInt(PC::price)
				.max();
		
		OptionalInt min = list.stream()
				.mapToInt(PC::price)
				.min();
		
		//count以外、プリミティブ型しか受け付けないため、プリミティブ型のストリームに変換してから実施している
		//sum以外のメソッドの戻り値は、ストリームが空だった場合計算できないので、Optionalのプリミティブ版であるOptionalDouble型とOptionalInt型になる
		
		System.out.println("件数 =" + count);
		System.out.println("合計 =" + sum);
		System.out.println("平均 =" + ave.getAsDouble()); //必ず値があると分かっている場合に、値の取り出しはgetメソッドではなく、getAsDoubleまたはgetAsIntを使う
		System.out.println("最大値 = " + max.getAsInt());
		System.out.println("最小値 = " + min.getAsInt());
		
		System.out.println(list);
	}

}
