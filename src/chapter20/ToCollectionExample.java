package chapter20;

import static java.util.stream.Collectors.*;

import java.util.TreeSet;

public class ToCollectionExample {
	public static void main(String[] args) {
		var list = PC.getList();
		
		TreeSet<String> set = list.stream()
				.map(PC::maker)
				.distinct()
				.peek(e -> System.out.printf("%10s", e))
				.collect(toCollection(TreeSet::new));
		
		System.out.println();
		set.forEach(e -> System.out.printf("%10s", e));
	}

}
