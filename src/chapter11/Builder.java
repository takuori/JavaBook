package chapter11;

public class Builder implements Editable {

	@Override
	public void write() {
		System.out.println("writable");
		

	}

	@Override
	public void load() {
		

	}

	@Override
	public void edit() {
		System.out.println("editable");
		

	}

}
