package chapter14;

import java.nio.file.Path;

public class PathExample2 {
	public static void main(String[] args) {
		Path p = Path.of("note.txt"); //相対パスを作成
		System.out.println(p);
		System.out.println(p.toAbsolutePath()); //絶対パスに変換
		Path p2 = Path.of(""); //相対カレントディレクトリ
		System.out.println(p2.toAbsolutePath()); //絶対カレントディレクトリ
	}

}
