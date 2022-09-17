package chapter13;

public class MyException extends Exception{ //Exceptionクラスを継承
	private static final long serialVersionUID = 28L;
	//離れた場所にあるシステムがエラーを起こして例外を送信してくることがある。
	//ネットワーク経由でやり取りするとき、手元のシステムと同じバージョンかどうかチェックするために使う
	
	public MyException(String msg) { //引数のあるコンストラクトを作成
		super(msg); //エラーメッセージを引数にするので、引数をスーパークラスのコンストラクタに渡す
	}
	
	public MyException() { //引数のないコンストラクタ
		
	}

}
