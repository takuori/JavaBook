package chapter17;

import java.time.LocalDate;
import java.util.Map;

public class Date {
	public static void main(String[] args) {
		var date = Map.of(
				"建国記念の日", LocalDate.of(2025, 2, 11),
				"昭和の日", LocalDate.of(2025, 4, 29),
				"憲法記念日", LocalDate.of(2025, 5, 3),
				"みどりの日", LocalDate.of(2025, 5, 4),
				"こどもの日", LocalDate.of(2025, 5, 5));
		
		for(Map.Entry<String, LocalDate> day : date.entrySet()) {
			System.out.println(day.getKey() + "\t" + day.getValue() );
		}
		
		
	}

}
