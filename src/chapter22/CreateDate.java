package chapter22;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class CreateDate {
	public static void main(String[] args) {
		
		//今日の日付を取得する際は、nowメソッドで作成
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate date = LocalDate.of(2025,  12, 8);
		System.out.println(date);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年MM月dd日 eeee");
		JapaneseDate jdate = JapaneseDate.from(date);
		System.out.println(jdate.format(fmt));
	}

}
