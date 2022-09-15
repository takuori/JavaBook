package chapter10;

public class Sum extends Calculation {

	public Sum(double[] dt) {
		super(dt);
	}

	@Override
	public double calculate() {
		double sum = 0;
		for(double x : getDt()) {
			sum += x;
		}
		return sum;
	}
	
	public double average() {
		return calculate() / getDt().length;
	}

}

