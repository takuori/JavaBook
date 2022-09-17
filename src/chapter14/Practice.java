package chapter14;

import java.nio.file.Files;
import java.nio.file.Path;

public class Practice {
	public static void main(String[] args) throws Exception {
		Path target = Path.of("data/list.txt");
		try {
			Files.deleteIfExists(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
