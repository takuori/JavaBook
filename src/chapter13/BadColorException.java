package chapter13;

public class BadColorException extends RuntimeException {
	private static final long serialVersionUID = 28L;
	
	public BadColorException(String msg) {
		super(msg);
	}
	
	public BadColorException() {
		
	}

}
