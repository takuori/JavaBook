package chapter16;

import java.util.ArrayList;

public class WrapperType {
	public static void main(String[] args) {
		
		//int型の値を入れるリストなのでInteger型のリストとして作成する。
		var list = new ArrayList<Integer>();
		list.add(120); //本来であればInteger型の値を指定しなくてはいけないので、list.add(new Integer(120));と書くところ
		list.add(130); //オートボクシング機能により、プリミティブ型からラッパー型へ自動的に変換されるようになっている
		list.add(140);
		
		//本来ここもfor(Integer n : list)としなければいけないが、
		//オートアンボクシング機能により、ラッパー型からプリミティブ型へ自動変換されるようになっている。
		for(int n : list) {
			System.out.println(n + "\t");
		}
	}

}
