package chapter4;

import java.time.LocalDate;

public class Author {
	
	private String name;
	private LocalDate birthday;
	private String address;
	
	public Author(String name, LocalDate birthday, String address) {
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}
	

}
