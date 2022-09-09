package chapter3;

import java.time.LocalDate;

public final class Immutable {
	
	private final String number;
	private final String name;
	private final int price;
	private final LocalDate date;
	private final boolean stock;
	
	//フィールド変数にfinalを付けている場合、必ず初期値を代入しておかなければならない
	//初期値を設定するコンストラクタが必要。コンパイルエラーになる
	public Immutable (String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}
	
	//セッターは作成しない

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "Immutable [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
				+ stock + "]";
	}
	
	

}
