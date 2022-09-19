package chapter15;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Path path = Path.of("foo/bar/tamai.txt");
		try(Scanner in = new Scanner(path);) {
			while(in.hasNext()) {
				int number = in.nextInt();
				String name = in.next();
				double weight = in.nextDouble();
				
				System.out.println(number + "\t" + name + "\t" + weight);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
