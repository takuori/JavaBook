package chapter4;

import java.time.LocalDate;

public final class Book {
	private final String title;
	private final Author author;
	private final LocalDate date;
	
	public Book(String title, Author author, LocalDate date) {
		this.title = title;
		
		//イミュータブルにするために、コピーを作成して代入する
		this.author = new Author(author.getName(), author.getBirthday(), author.getAddress());
		this.date = date;
		
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		//フィールド変数のコピーを作成してそれを戻り値として返す
		return new Author(author.getName(), author.getBirthday(), author.getAddress());
	}

	public LocalDate getDate() {
		return date;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", date=" + date + "]";
	}
	

}
