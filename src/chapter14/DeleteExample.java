package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteExample {
	public static void main(String[] args) throws Exception {
		Path target = Path.of("foo/bar/list.txt");
		Files.deleteIfExists(target);
	}

}
