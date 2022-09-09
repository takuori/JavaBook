package chapter5;

public class Ex5_1 {
	public static void main(String[] args) {
		
		Health health = new Health(70, 178.1);
		
		System.out.printf("標準体重=%5.1f%n",health.stdWeight());
		System.out.printf("BMI指数=%5.1f%n", health.Bmi());
	}

}
