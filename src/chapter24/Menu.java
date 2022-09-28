package chapter24;

public enum Menu {
	MEAT("肉料理"),
	VEGETABLE("野菜料理"),
	FISH("魚料理");
	
	private String MenuType;
	private Menu(String MenuType) {
		this.MenuType = MenuType;
	}
	
	public String getName() {
		return MenuType;
	}

}
