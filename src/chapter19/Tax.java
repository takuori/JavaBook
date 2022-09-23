package chapter19;

//税率を決めるTaxRateインターフェース
interface TaxRate {
	double rate(int gaku);
}

public class Tax {
	public static void main(String[] args) {
		int shotoku = 200;
		
		//TaxRateインターフェースを実装したオブジェクトを定義・生成して渡している（ラムダ式）
		double zeigaku = tax(shotoku, a -> a<100 ? 0.15 : 0.35);
		System.out.println("税額：" + zeigaku);
	}
	
	public static double tax(int shotoku, TaxRate obj) {
		double r = obj.rate(shotoku);
		return r * shotoku;
	}

}
