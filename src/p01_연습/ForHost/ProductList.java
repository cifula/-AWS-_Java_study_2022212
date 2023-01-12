package p01_연습.ForHost;

import p01_연습.Menu;

public class ProductList extends Menu {

	ProductRepository productTable;
	
	public ProductList(ProductRepository productRepository) {
		this.productTable = productRepository;
	}

	@Override
	public void show() {
		System.out.println("====== << 메 뉴 >> ======");
		
		System.out.println("=========================");
		System.out.println("b. 뒤로가기");		

	}

	@Override
	public boolean menu(char select) {
		if(isBack(select)) {
			return false;
		}
		return true;
	}
	
	private boolean isBack(char select) {
		return select == 'b' || select == 'B';
	}
	
	private String inputErrorMessage() {
		return "잘못된 입력입니다.";
	}

}
