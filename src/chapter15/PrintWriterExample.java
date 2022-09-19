package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) {
		try(PrintWriter out = new PrintWriter("foo/bar/tamai.txt");) {
			out.print(100);
			out.print("\t");
			out.print("玉井詩織");
			out.print("\t");
			out.println(49.1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
