package chapter14;

import java.nio.file.Path;

public class PathExample {
	public static void main(String[] args) {
		Path p = Path.of("D:/docs/note.txt"); //絶対パスを作成
		System.out.println(p); //絶対パスを表示
		System.out.println(p.getRoot()); //パスの起点を取得する。元のパスが絶対パスの時だけ使える。相対パスの場合はnullになる
		System.out.println(p.getParent()); //元のパスに対して1つ上の階層までのパスを取得する
		System.out.println(p.getFileName()); //パスの末端の要素を返す
	}

}
