package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;

public class MoveExample1 {
	public static void main(String[] args) throws Exception {
		//Path source = Path.of("temp/note.txt");
		//Path target = Path.of("temp/memo.txt");
		//Files.move(source,  target);
		
		//Path source = Path.of("temp/memo.txt");
		//Path target = Path.of("foo/bar/memo.txt");
		//Files.move(source,  target);
		
		Path p1 = Path.of("temp/list.txt");
		Path p2 = Path.of("foo/bar/list.txt");
		Files.move(p1,  p2);
	}

}
