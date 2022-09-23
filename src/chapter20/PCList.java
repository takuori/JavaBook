package chapter20;

import java.util.TreeSet;

record PC(String name, String type, int price, String maker) implements Comparable<PC>{

	@Override
	public int compareTo(PC other) {
		return Integer.compare(this.price, other.price);
	}
	
	public static TreeSet<PC> getList() {
        var PC = new TreeSet<PC>();
		
		PC.add(new PC("DELO-200", "DESKTOP", 50000, "DELO"));
		PC.add(new PC("HQ-110A", "DESKTOP", 68000, "HQ"));
		PC.add(new PC("PnaMini", "TABLET", 62000, "Panan"));
		PC.add(new PC("SeakBook", "LAPTOP", 98000, "HQ"));
		PC.add(new PC("Panalet", "LAPTOP", 75000, "Panan"));
		PC.add(new PC("HQ-Star", "DESKTOP", 60000, "HQ"));
		PC.add(new PC("LatteAir", "LAPTOP", 85000, "Latte"));
		PC.add(new PC("Nactop", "LAPTOP", 79000, "Nect"));
		PC.add(new PC("DELOPad", "TABLET", 48000, "DELO"));
		PC.add(new PC("DELO-100", "DESKTOP", 48000, "DELO"));
		PC.add(new PC("ARIBAN", "TABLET", 12000, "Arivan"));
		
		return PC;
	}

}
