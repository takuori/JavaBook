package chapter20;

import static java.util.stream.Collectors.*;

import java.util.Set;
import java.util.TreeSet;

public class ToSetExample {
	public static void main(String[] args) {
		TreeSet<PC> list = PC.getList();
		
		Set<String> types = list.stream()
				.map(PC::type)
				.collect(toSet()); //setに変換されることでistinctを使わなくても重複を消すことができる
		
		types.forEach(System.out::println);
	}

}
