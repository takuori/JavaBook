package chapter1;

public class Seiseki {
	private String number;
	private String name;
	private double[] score;
	private boolean attend;
	
	public Seiseki(String number, String name, double[] score, boolean attend) {
		this.number = number;
		this.name = name;
		this.score = score;
		this.attend = attend;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public double[] getScore() {
		return score;
	}

	public boolean isAttend() {
		return attend;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(double[] score) {
		this.score = score;
	}

	public void setAttend(boolean attend) {
		this.attend = attend;
	}
	
	

}
