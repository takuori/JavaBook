package chapter3;

import java.time.LocalDate;

public class OverRord {
	
	private String number;
	private String name;
	private int price;
	private LocalDate date;
	private boolean stock;
	
	//通常のコンストラクタ
	public OverRord(String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}
	
	//引数を減らしてオーバーロードしたコンストラクタ
	public OverRord(String number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = LocalDate.now();
		this.stock = true;
	}
	
	//ファイルから初期値を読み込むコンストラクタ
	public OverRord(String fileName) {
		//fileNameのデータファイルから初期値を読み込んで、フィールド変数にセットする処理
	}
	
	//引数のないコンストラクタ
	public OverRord() {
		
	}
	
	
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

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}
	

	@Override
	public String toString() {
		return "OverRord [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
				+ stock + "]";
	}

	public static void main(String[] args) {
		OverRord o = new OverRord();
		System.out.println(o);
	}
}
