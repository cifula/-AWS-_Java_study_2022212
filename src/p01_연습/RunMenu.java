package p01_연습;

import java.util.Scanner;

public class RunMenu {
	private Menu menu;
	private Scanner scanner;

	public RunMenu(Menu menu) {
		this.menu = menu;
		scanner = new Scanner(System.in);
	}
	
	public RunMenu() {
		this.menu = new MainMenu();
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		boolean flag = true;
		char select = '\0';

		while(flag) {
			menu.show();
			select = inputSelect();
			flag = menu.menu(select);
			System.out.println();
		}
	}

	

	
	private char inputSelect () {
		char select = '\0';
		System.out.print("입력: ");
		select = scanner.next().charAt(0);
		return select;
	}



}
