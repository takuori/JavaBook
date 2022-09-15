package chapter9;

public class ExecFoo {
	public static void main(String[] args) {
		//Foo foo = new Foo();
		//System.out.println(foo.calc());
		
		//Foo foo = new Bar();
		//System.out.println(foo.calc());
		
		Foo foo = new Baz();
		System.out.println(foo.calc());
		
		//本来は変数fooに入っているインスタンスは「実際の型」がBar型orBaz型のため、Foo型の変数ではcalcメソッドにアクセスできないはずだが
		//ダイナミックバインディングでオーバーライドしたメソッドはアクセスできる範囲に関係なく、実行される
	}

}
