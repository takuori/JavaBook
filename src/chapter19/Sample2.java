package chapter19;

import java.util.ArrayList;

record Student (int id, String name) {}

public class Sample2 {
	public static void main(String[] args) {
		var list = new ArrayList<Student>();
		list.add(new Student(101, "玉井詩織"));
		list.add(new Student(102, "百田夏菜子"));
		list.add(new Student(103, "佐々木彩夏"));
		list.add(new Student(104, "高城れに"));
		
		//list.forEach(student -> System.out.println(student));
		list.forEach(System.out::println);
	}

}
