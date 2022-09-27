package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class DateStream {
	public static void main(String[] args) {
		LocalDate startDay = LocalDate.of(2025, 2, 1);
		LocalDate endDay = LocalDate.of(2025, 3, 1);

		//開始日から終了日までの日付オブジェクトのストリームを生成してリストにしている
		//終了日はストリームには含まない
		//計28個のLocalDateのインスタンスがリストに含まれている
		List<LocalDate> dates = startDay.datesUntil(endDay).toList();
        
		//日付ストリームの要素の間隔をPeriod.ofWeeks(1)で一週間毎と指定している
		startDay.datesUntil(endDay, Period.ofWeeks(1))
				.forEach(d -> System.out.printf("%12s", d));
	}

}
