package chapter20;

import java.util.Optional;
import java.util.TreeSet;

public class MatchExample {
	public static void main(String[] args) {
		TreeSet<PC> pcList = PC.getList();
		
		//条件にマッチしているか調べるメソッド（ARIBANという名前のPCがあるか）
		if(pcList.stream().anyMatch(pc -> "ARIBAN".equals(pc.name()))) {
			System.out.println("ARIBANという名前のパソコンあります");
		} else {
			System.out.println("ARIBANという名前のパソコンはありません");
		}
		
		Optional<String> anyPc = pcList.stream()
				                       .filter(pc -> "Panann".equals(pc.maker())) //PCリストからPanannというメーカーのものだけをフィルタリング
				                       .map(PC::maker)                            //メーカー名のストリームに変換
				                       .findAny();                                //要素があれば任意のもの1つ返す
		System.out.println(anyPc.orElseGet(()->"存在しない"));                   //orElseGetで要素があればその値を返し、なければラムダ式の値を返す（存在しないを返す）
		
		Optional<String> names = pcList.stream()
				                     .map(PC::name)                              //機種名を取り出す
				                     .reduce((a,b) -> a + ", " + b);             
		System.out.println(names.get());
	}

}
