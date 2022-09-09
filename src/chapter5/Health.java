package chapter5;

public class Health {
	
	private double weight;
	private double height;
	
	public Health(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double stdWeight() {
		return Math.pow(height/100, 2)*22;
	}
	
	public double Bmi() {
		return weight/Math.pow(height/100, 2);
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Health [weight=" + weight + ", height=" + height + "]";
	}
	
	

}
