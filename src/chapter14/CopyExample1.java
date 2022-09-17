package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;

public class CopyExample1 {
	public static void main(String[] args) throws Exception {
		Path source = Path.of("foo/bar/note.txt");
		Path target = Path.of("temp/note.txt");
		Files.copy(source,  target);
	}

}
