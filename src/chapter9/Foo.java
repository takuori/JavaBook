package chapter9;

public class Foo {
	private double x = 10;
	public double calc() {
		return x;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	

}

class Bar extends Foo {
	@Override
	public double calc() {
		return getX() * 2;
	}
}

class Baz extends Foo {
	@Override
	public double calc() {
		return getX() / 2;
	}
}
