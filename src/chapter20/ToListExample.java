package chapter20;

import static java.util.stream.Collectors.*;

import java.util.List;

public class ToListExample {
	public static void main(String[] args) {
		var list = PC.getList();
		
		List<String> mutable = list.stream().map(PC::type)
				.collect(toList());
		
		List<String> immutable = list.stream().map(PC::type)
				.collect(toUnmodifiableList());
	}

}
