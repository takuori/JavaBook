package chapter13;

public class ThrowException {
	public static void main(String[] args) {
		try {
			sub();
		} catch(Exception e) {
			System.out.println("例外が発生しました！！");
		}
	}
	
	public static void sub() throws Exception {
		throw new Exception();
	}

}
