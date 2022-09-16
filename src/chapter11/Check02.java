package chapter11;

public class Check02 implements CheckNumber {

	@Override
	public boolean test(int n) {
		return n%2==0 || n>100;
	}

}
