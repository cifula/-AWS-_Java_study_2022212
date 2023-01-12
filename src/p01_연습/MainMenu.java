package p01_연습;

import p01_연습.ForCustomer.CustomerMenu;
import p01_연습.ForHost.HostLoginMenu;

public class MainMenu extends Menu {

	@Override
	public void show() {
		System.out.println("==== << 메인 메뉴 >> ====");
		System.out.println("1. 주문하기");
		System.out.println("2. 사업자 로그인");
		System.out.println("=========================");
		System.out.println();
	}
	
	@Override
	public boolean menu(char select) {
		boolean flag = true;
		
		if(isExit(select)) {
			flag = false;
			return flag;
		} else {
			if(select == '1') {
				RunMenu run = new RunMenu(new CustomerMenu());
				run.run();
			} else if(select == '2') {
				RunMenu run = new RunMenu(new HostLoginMenu());
				run.run();
			} else {
				System.out.println(inputErrorMessage());
			}
		}
		return flag;
	}
	
	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
	
	private String inputErrorMessage() {
		return "잘못된 입력입니다.";
	}

}
