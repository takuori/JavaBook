package chapter6;

import java.time.LocalDate;

public class StudentMember extends Member { //継承の宣言（Memberクラスを取り込んで拡張する）意味
	private LocalDate birthday;
	
	//スーパークラスに引数がある場合、サブクラスのコンストラクタには引数として、スーパークラスの初期化に必要なものも含めておく必要がある。
	public StudentMember(int id, String name, LocalDate birthday) {
		
		//取り込んだスーパークラス部分を最初に初期化しなければならない
		super(id, name);
		this.birthday = birthday;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public LocalDate expirationDate() {
		return birthday.plusYears(18);
	}

}
