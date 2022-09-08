package chapter1;

import java.time.LocalDate;

public class ExecBihin {
	public static void main(String[] args) {
		Bihin bihin1 = new Bihin("パソコン", LocalDate.of(2013, 03, 10), 10000, 5);
		Bihin bihin2 = new Bihin("スキャナー", LocalDate.of(2010, 07, 21), 62500, 1);
		Bihin bihin3 = new Bihin("書架", LocalDate.of(2015, 10, 01), 138800, 2);
		
		LocalDate dateX = LocalDate.of(2010, 03, 15);
		
		System.out.println(bihin1);
		System.out.println(bihin2);
		System.out.println(bihin3);
		
		// LocalDate before = bihin1.getDate();
		// System.out.println("変更前：" + before;でも可
		System.out.println("変更前：" + bihin1.getDate());
		
		bihin1.setDate(LocalDate.of(2013, 04, 01));
		// LocalDate after = bihin1.getdate();
		
		System.out.println("変更後：" + bihin1.getDate());
		// System.out.println("変更後：" + afetr;　でも可
		
		System.out.println(bihin1.isAfterBihin(dateX));
		
	}

}
