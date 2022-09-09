package chapter5;

public class Csv {
	
	private String[] items;  //CSV文字列を分割した配列
	
	public Csv(String csvString) {
		this.items = csvString.split(",");
	}
	
	public String get(int index) {
		return items[index];
	}
	
	public int getInt(int index) {
		return Integer.parseInt(items[index]); //parseIntは文字列をint型に変換するクラスメソッド
	}
	
	public double getDouble(int index) {
		return Double.parseDouble(items[index]);  //parseDoubleは文字列をdouble型に変換するクラスメソッド
	}
	
	public int size() {
		return items.length;
	}

}
