package j09_2_연습;

import java.util.Scanner;

public class J09_2_Login {
	String enterId;
	String enterPassword;
	
	String id = "aaa";
	String password = "111";
	String age = "29";
	String address = "부산광역시 부산진구 부전동";
	String email = "lidel95@gmail.com";
	String phone = "010-5138-1823";
			
//	---- 로그인 체크 ---
	
	public String enterId() {
		Scanner scanner = new Scanner(System.in);
		String enterId = null;
		
		System.out.print("id: ");
		enterId = scanner.nextLine();
		
		return enterId;
	}
	
	public String enterPassword() {
		Scanner scanner = new Scanner(System.in);
		String enterPassword = null;
		
		System.out.print("password: ");
		enterPassword = scanner.nextLine();
		
		return enterPassword;
	}
	
	boolean loginCheck(String enterId, String enterPassword ) {
		boolean loginFlag;
		
		if(enterId.equals(id) && enterPassword.equals(password)) {
			System.out.println("로그인에 성공하셨습니다.");
			loginFlag = true;
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			loginFlag = false;
		}
		
		return loginFlag;
	}
	
//	----------
	
	void login() {
		String enterId;
		String enterPassword;
		
		enterId = enterId();
		enterPassword = enterPassword();
		
		boolean loginFlag = loginCheck(enterId, enterPassword);
		
		if (loginFlag == true) {
			mainMenu();
		}
		
		System.out.println("프로그램이 안전하게 종료되었습니다.");
	}
	

	
	void mainMenu() {
		boolean loopFlag = true;
		
		while(loopFlag) {

			Scanner scanner = new Scanner(System.in);
			char select = '\0';
			
			System.out.println("========<< 메인 메뉴 >>========");
			System.out.println("1. 정보 확인");
			System.out.println("2. 정보 수정");
			System.out.println("===============================");
			System.out.println("q. 프로그램 종료");
			System.out.println("===============================");
			System.out.println();
			
			System.out.println("입력: ");
			select = scanner.next().charAt(0);
			
			if (select == 'q' || select == 'Q') {
				loopFlag = false;

			} else if (select == '1') {
				boolean loopFlag2 = true;
				while (loopFlag2) {
					System.out.println("========<< 정보 확인 >>========");
					System.out.println("id: " + id);
					System.out.println("password: " + password);
					System.out.println("나이: " + age);
					System.out.println("주소: " + address);
					System.out.println("이메일: " + email);
					System.out.println("연락처: " + phone);
					System.out.println("===============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("===============================");
					
					select = scanner.next().charAt(0);
					
					if(select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag2 = false;
						loopFlag = false;
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				}

				
			} else if (select == '2') {
				boolean loopFlag2 = true;
				
				while(loopFlag2) {
					select = '\0';
					
					System.out.println("========<< 정보 수정 >>========");
					System.out.println("1. id");
					System.out.println("2. password");
					System.out.println("3. 나이");
					System.out.println("4. 주소");
					System.out.println("5. 이메일");
					System.out.println("6. 연락처");
					System.out.println("===============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("===============================");
					
					System.out.print("변경할 정보 선택: ");
					
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					if(select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag2 = false;
						loopFlag = false;
					} else if (select == '1') {
						System.out.print("id: ");
						id = scanner.nextLine();
					} else if (select == '2') {
						System.out.print("password: ");
						password = scanner.nextLine();
					} else if (select == '3') {
						System.out.print("나이: ");
						age = scanner.nextLine();
					} else if (select == '4') {
						System.out.print("주소: ");
						address = scanner.nextLine();
					} else if (select == '5') {
						System.out.print("이메일: ");
						email = scanner.nextLine();
					} else if (select == '6') {
						System.out.print("연락처: ");
						phone = scanner.nextLine();
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				}
				
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
		}

	}
				
}

