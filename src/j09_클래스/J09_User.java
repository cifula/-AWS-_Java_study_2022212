package j09_클래스;

import java.util.Scanner;

public class J09_User {
	String username;
	String password;
	String name;
	String email;
	
	void printInfo() {
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("name    : " + name);
		System.out.println("email   : " + email);
		System.out.println();
	}
	
	void makeUser() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("username: ");
		username = scanner.nextLine();
		
		System.out.print("password: ");
		password = scanner.nextLine();
		
		System.out.print("name: ");
		name = scanner.nextLine();
		
		System.out.print("email: ");
		email = scanner.nextLine();
		
		System.out.println();
		
		printInfo();
	}
	
	void changeInfo() {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("========<<메뉴>>========");
			System.out.println("1. username");
			System.out.println("2. password");
			System.out.println("3. name");
			System.out.println("4. email");
			System.out.println("=========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("=============================");
			
			System.out.print("변경할 정보 선택: ");
			
			select = scanner.next().charAt(0);
			scanner.nextLine();
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
			} else if (select == '1') {
				System.out.print("username: ");
				username = scanner.nextLine();
			} else if (select == '2') {
				System.out.print("password: ");
				password = scanner.nextLine();
			} else if (select == '3') {
				System.out.print("name: ");
				name = scanner.nextLine();
			} else if (select == '4') {
				System.out.print("email: ");
				email = scanner.nextLine();
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
			System.out.println();
			
		}
	}

}
