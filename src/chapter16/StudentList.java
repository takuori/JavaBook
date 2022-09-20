package chapter16;

import java.util.TreeSet;

record Student(int id, String name) implements Comparable<Student>{
	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.id,  other.id);
	}
} //Studentレコード

public class StudentList {
	public static void main(String[] args) {
		
		var list = new TreeSet<Student>();
		
		list.add(new Student(101, "玉井詩織"));
		list.add(new Student(102, "百田夏菜子"));
		list.add(new Student(103, "佐々木彩夏"));
		list.add(new Student(104, "高城れに"));
		
		for(Student s : list) {
			System.out.println(s);
		}
		
	}

}
