package chapter6;

import java.time.LocalDate;

public class ExecStudentMember {
	public static void main(String[] args) {
		StudentMember stmem = new StudentMember(100, "玉井詩織", LocalDate.of(2004, 7, 30));
		
		System.out.println(stmem.getId());
		System.out.println(stmem.getName());
		System.out.println(stmem.getBirthday());
		System.out.println(stmem.expirationDate());
	}

}
