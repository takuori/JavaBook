package chapter11;

public class BookShop implements Readable {
	private String name;

	@Override
	public void read() {
		System.out.println( "Readable");
	}

	public BookShop(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
