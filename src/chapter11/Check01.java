package chapter11;

public class Check01 implements CheckNumber {

	@Override
	public boolean test(int n) {
		return n<50 || n>100;
	}

}
