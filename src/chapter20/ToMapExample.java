package chapter20;

import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.TreeSet;

public class ToMapExample {
	public static void main(String[] args) {
		TreeSet<PC> list = PC.getList();
		
		Map<String, Integer> pcMap = list.stream()
				.collect(toMap(PC::name, PC::price)); //キー値を得るラムダ式と値を得るラムダ式を指定する
		
		pcMap.forEach((k,v) -> System.out.println(k + " = " + v));
	}

}
