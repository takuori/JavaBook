package chapter13;

public class Ex2 {
	public static void main(String[] args) {
		try {
			color();
		} catch (BadColorException bad) {
			System.out.println(bad.getMessage());
		}
	}
	
	public static void color() throws BadColorException {
		throw new BadColorException("不正な色だよ！！");
	}

}
