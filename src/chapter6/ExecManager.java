package chapter6;

public class ExecManager {
	public static void main(String[] args) {
		Manager mana = new Manager(10, "玉井詩織", 27, "アイドル");
		
		System.out.print(mana.getId() + "\t");
		
		System.out.print(mana.getName() + "\t");
		
		System.out.print(mana.getAge() + "\t");
		
		System.out.println(mana.getTitle());
	}

}

