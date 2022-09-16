package chapter11;

public class ErrorCheck {
	public static void main(String[] args) {
		int[] numbers = {110, 30, 50, 99, 58, 21};
		findError(numbers, new Check01());
		findError(numbers, new Check02());
	}
	
	public static void findError(int[] numbers, CheckNumber t) {
		for(int n : numbers) {
			if(t.test(n)) {
				System.out.println(n);
			}
		}
	}


}
