package p01_연습.ForCustomer;

import p01_연습.Menu;

public class CustomerMenu extends Menu {

	@Override
	public void show() {
		System.out.println("==== << 주문하기 >> ====");
		System.out.println("1. 블랙 어니언 와퍼");
		System.out.println("2. 기네스");
		System.out.println("=========================");
		System.out.println();
	}
		


	@Override
	public boolean menu(char select) {
		boolean flag = true;
		
		if(select == '1') {
			
		}
		
		return flag;
	}
	
	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
	
	private boolean isBack(char select) {
		return select == 'b' || select == 'B';
	}
	
	private String inputErrorMessage() {
		return "잘못된 입력입니다.";
	}

}
