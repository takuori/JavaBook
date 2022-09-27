package chapter23;

public class Sample {
	public static void main(String[] args) {
		//テキストブロック（二重引用符）
		String str = """
				玉井詩織 \
				百田夏菜子 \
				真田丸 \
				""";
		System.out.println(str);
		
		String str1 = """
				name:%s
				age:%d
				weight:%.1f
				""".formatted("玉井詩織", 27, 158.4);
		System.out.println(str1);
	}

}
