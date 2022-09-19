package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample3 {
	public static void main(String[] args) throws Exception {
		Path path = Path.of("foo/bar/tamai.txt");
		Files.createFile(path);
	}

}
