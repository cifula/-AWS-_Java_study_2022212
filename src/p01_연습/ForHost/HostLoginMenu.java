package p01_연습.ForHost;

import p01_연습.Menu;
import p01_연습.RunMenu;
import p01_연습.ForCustomer.CustomerMenu;

public class HostLoginMenu extends Menu {

	@Override
	public void show() {
		System.out.println("==== << 메인 메뉴 >> ====");
		System.out.println("1. 주문내역");
		System.out.println("2. 메뉴 목록");
		System.out.println("3. 메뉴 추가");
		System.out.println("4. 메뉴 삭제");
		System.out.println("=========================");
		System.out.println("b. 뒤로가기");		
	}

	@Override
	public boolean menu(char select) {
		if(isBack(select)) {
			return false;
		} else {
			if (select == '1') {
				RunMenu run = new RunMenu(new OrderList());
				run.run();
			} else if (select == '2') {
//				RunMenu run = new RunMenu(new ProductList(ProductRepository()));
//				run.run();
			} else if (select == '3') {
				RunMenu run = new RunMenu(new AddProduct());
				run.run();
			} else if (select == '4') {
				RunMenu run = new RunMenu(new DelProduct());
				run.run();
			} else {
				System.out.println(inputErrorMessage());
			}
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


