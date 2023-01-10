package p01_연습;

public class MainMenu extends Menu {

	@Override
	public void show() {
		System.out.println("==== << 메인 메뉴 >> ====");
		System.out.println("1. 회원 로그인");
		System.out.println("2. 비회원 주문");
		System.out.println("3. 사업자 로그인");
		System.out.println("4. 회원가입");
		System.out.println();
	}
	
	@Override
	public boolean menu(char select) {
		boolean flag = true;
		
		if(isExit(select)) {
			flag = false;
			return flag;
		}
		
		while(flag) {
			if(select == '1') {
				RunMenu run = new RunMenu(new GeneralLoginMenu());
				run.run();
			} else if(select == '2') {
				RunMenu run = new RunMenu(new NotLoginMenu());
				run.run();
			} else if(select == '2') {
				RunMenu run = new RunMenu(new BuisnessLoginMenu());
				run.run();
			} else if(select == '2') {
				RunMenu run = new RunMenu(new RegisterUserMenu());
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
	
	private boolean isBack(char select) {
		return select == 'b' || select == 'B';
	}
	
	private String inputErrorMessage() {
		return "잘못된 입력입니다.";
	}

}
