package chapter15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewBufferedWriterExample {
	public static void main(String[] args) {
		Path path = Path.of("foo/bar/tamai.txt");
		try(BufferedWriter out = Files.newBufferedWriter(path, 
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);) {
			out.write(110+"\t");
			out.write("百田夏菜子"+"\t");
			out.write(48.2+"\t");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
