package chapter22;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Practice {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2028, 7, 21);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年M月d日 eeee");
		JapaneseDate jdate = JapaneseDate.from(date);
		System.out.println(jdate.format(fmt));
		
		LocalDate start = LocalDate.of(2022, 2, 1);
		Period period = Period.between(start, date);
		
		System.out.println("オリンピックまであと" + period.getYears() + "年" + period.getMonths() + "か月と" + period.getDays() + "日");
	
	    
		System.out.println("-----------------------------------");
		
		LocalDate date1 = LocalDate.of(2025, 1, 1);
		LocalDate date2 = LocalDate.of(2025, 7, 1);
		LocalDate date3 = LocalDate.of(2025, 9, 1);
		LocalDate date4 = LocalDate.of(2025, 10, 1);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("M月d日 eeee");
		
		TemporalAdjuster nextMonday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY);
		TemporalAdjuster nextMonday1 = TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY);
		System.out.println(date1.with(nextMonday).format(fmt1));
		System.out.println(date2.with(nextMonday1).format(fmt1));
		System.out.println(date3.with(nextMonday1).format(fmt1));
		System.out.println(date4.with(nextMonday).format(fmt1));
		
		System.out.println("-----------------------------------");
		
		LocalTime start1 = LocalTime.of(9, 12, 30);
		LocalTime goal1 = LocalTime.of(14, 15, 10);
		LocalTime start2 = LocalTime.of(9, 35, 20);
		LocalTime goal2 = LocalTime.of(15, 44, 20);
		
		Duration tanaka = Duration.between(start1, goal1);
		Duration suzuki = Duration.between(start2, goal2);
		Duration time = suzuki.minus(tanaka);
		
		System.out.println("田中宏：" + tanaka.toHoursPart() + "時間" + tanaka.toMinutesPart() + "分" + tanaka.toSecondsPart() + "秒");
		System.out.println("鈴木二郎：" + suzuki.toHoursPart() + "時間" + suzuki.toMinutesPart() + "分" + suzuki.toSecondsPart() + "秒");
		System.out.println("時間差：" + time.toHoursPart() + "時間" + time.toMinutesPart() + "分" + time.toSecondsPart() + "秒");
	
		System.out.println("-----------------------------------");
		
		
		LocalDateTime dt1 = LocalDateTime.of(2025, 2, 21, 13, 00, 00);
		LocalDateTime dt2 = LocalDateTime.of(2026, 5, 7, 10, 15, 30);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y/MM/dd ahh:mm:ss");
		
		LocalDateTime dt3 = dt1.plusMinutes(3245).plusSeconds(320);
		Duration p = Duration.between(dt1, dt2);
		
		System.out.println(dt3.format(fmt2));
		System.out.println("全期間は" + p.toSeconds() + "秒間");
		
		
	}

}
