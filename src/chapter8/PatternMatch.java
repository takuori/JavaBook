package chapter8;

import java.time.LocalDate;

import chapter6.Member;
import chapter6.StudentMember;

public class PatternMatch {
	public static void main(String[] args) {
		Member member = new StudentMember(100, "玉井詩織", LocalDate.of(1995, 06, 04));
	
		if(member instanceof StudentMember s) { 
			System.out.println(s.getBirthday());
		}
		
		//パターンマッチ式を使わない場合
		if(member instanceof StudentMember) {
			StudentMember s = (StudentMember)member;
			System.out.println(s.getBirthday());
		}
	}

}
