package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateEXample1 {
	public static void main(String[] args) {
		Path path = Path.of("temp");
		try {
			Files.createDirectory(path); //新しいディレクトリの作成
			//Filesクラスのメソッドはどれもstaticメソッドなのでこのように書く
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
