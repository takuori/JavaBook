package chapter20;

import static java.util.Comparator.*;

import java.util.List;

public class Skip_LimitExample {
	public static void main(String[] args) {
		var list = PC.getList();
		
		List<PC> limitedPCs = list.stream()
				.sorted(comparing(PC::price))
				.skip(3)
				.limit(3)
				.toList();
		
		limitedPCs.forEach(System.out::println);
	}

}
