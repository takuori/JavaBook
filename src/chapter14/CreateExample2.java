package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample2 {
	public static void main(String[] args) throws Exception {
		Path path = Path.of("foo/bar");
		Files.createDirectories(path);
	}

}
