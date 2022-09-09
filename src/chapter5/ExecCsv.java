package chapter5;

public class ExecCsv {
	public static void main(String[] args) {
		String str = "100,玉井詩織,27,48.1,159.4";
		
		Csv csv = new Csv(str);
		String name = csv.get(1);
		double weight = csv.getDouble(3);
		double height = csv.getDouble(4);
		
		double bmi = weight/Math.pow(height/100, 2);
		
		System.out.printf("%5s%6.1f",name,bmi);
	}

}
