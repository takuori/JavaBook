package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewBufferReaderExample {
	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("foo/bar/note.txt");
		BufferedReader in = Files.newBufferedReader(path, Charset.forName("UTF-8"));
		
		String line;
		while((line=in.readLine())!=null) {
			System.out.println(line);
		}
	}

}
