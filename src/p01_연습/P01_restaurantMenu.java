package p01_연습;

public class P01_restaurantMenu {
	private String menuName;
	private String menuDescribed;
	private String menuPrice;
	
	public P01_restaurantMenu(String menuName, String menuDescribed, String menuPrice) {
		this.menuName = menuName;
		this.menuDescribed = menuDescribed;
		this.menuPrice = menuPrice;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDescribed() {
		return menuDescribed;
	}

	public void setMenuDescribed(String menuDescribed) {
		this.menuDescribed = menuDescribed;
	}

	public String getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(String menuPrice) {
		this.menuPrice = menuPrice;
	}
	
	
	
}
