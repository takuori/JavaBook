package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1995, 6, 3);
		LocalDate today = LocalDate.now();
		System.out.println(birthday + "～" + today);
		
		//誕生日から今日までの期間を日数に直した値を計算している
		long days = ChronoUnit.DAYS.between(birthday, today);
		System.out.println("誕生日から" + days + "日");
		LocalDate newDay = today.plusDays(22);
		System.out.println(newDay + "に、" + "誕生から10000日経つことになる");
		LocalDate newDays = newDay.plusDays(10000);
		System.out.println(newDay + "の10000日後は" + newDays);
		
		//Period型のインスタンスを作成。その期間を構成する年月日の値を取得できる
		Period period = Period.between(birthday,  today);
		System.out.print(period.getYears() + "歳");
		System.out.print(period.getMonths() + "か月");
		System.out.print(period.getDays() + "日");
		
	}

}
