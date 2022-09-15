package chapter10;

//抽象クラス
public abstract class GeometricShape {
	
	private String color;
	
	protected GeometricShape(String color) {
		this.color = color;
		
		//サブクラスのインスタンスを作成するときに初期化のためにスーパークラスのこのコンストラクタが呼ばれる。
		//その時しか使い道がないので、protectedにしている
	}
	
	//抽象メソッド
	public abstract String getName();
	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
