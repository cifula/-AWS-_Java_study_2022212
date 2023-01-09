package p01_연습;

import java.util.Scanner;

public class OrderService {
	
	private Scanner scanner;
	
	public OrderService() {
		scanner = new Scanner(System.in);
	}

	public void run() {
		boolean loopFlag = true;
		
		while(loopFlag) {
			char select = '\0';
			showMainMenu();
			loopFlag = mainMenu(select);
		}
	}
	
	public void stop() {
		
	}
	
	public void showMainMenu() {
		System.out.println("========<< 메인메뉴 >>========");
		System.out.println("1. 회원 주문");
		System.out.println("2. 비회원 주문");
		System.out.println("3. 업장 관리자 로그인");
		System.out.println("4. 회원가입");
		System.out.println("==============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	
	public boolean mainMenu(char select) {
		boolean loopFlag = true;
		
		if(isExit(select)) {
			
		}
		
		return loopFlag;
	}
	
	public boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
}
