package j12_배열;

import java.util.Scanner;

public class J12_UserService {
	
	private Scanner scanner;
	private J12_UserRepository userRepository;
	
	// J12_UserService() 가 생성되어야 scanner가 생성됨.
	public J12_UserService(J12_UserRepository userRepository) {
		scanner = new Scanner(System.in);
		this.userRepository = userRepository;
	}
	
	public void run() {
		boolean loopFlag = true;
		char select = '\0';
		
		while(loopFlag) {
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);
			}
	}
	
	public void stop() {
		for(int i = 0; i < 1; i ++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private char inputSelect(String menuName) {
		System.out.print(menuName + "메뉴 선택: ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	
	
	
	private void showMainMenu() {
		System.out.println("========<< 메인메뉴 >>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원등록");
		System.out.println("3. 사용자이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("==============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}
	
	private void showUsers() {
		J12_User[] users = userRepository.getUserTable();
		boolean flag = true;
		System.out.println("========<< 회원 전체 조회 >>========");
		if(isTableLengthZero(users)) {
			System.out.println(getUserDataErrorMessage());
		} else {
			for(J12_User user : users) {
				System.out.println(user.toString());
			}
		}
		
		System.out.println("====================================");
	}
	
	private J12_User showModifyUserMenu() {
		String username;
		J12_User user;
		char select = '\0';
		System.out.println("======<< 수정메뉴 >>======");
		System.out.print("사용자 이름: ");
		username = scanner.next();
		System.out.println("==========================");
		System.out.println("1. 비밀번호 변경");
		System.out.println("2. 이름 변경");
		System.out.println("3. 이메일 변경");
		System.out.println("==========================");
		System.out.println("b. 뒤로가기");
		System.out.println();
		
		user = userRepository.findUserByUsername(username);
		
		return user;
	}
			
		

	
	private void registerUser() {
		J12_User user = new J12_User();
		
		System.out.println("========<< 회원 등록 >>========");
		System.out.print("사용자이름: ");
		user.setUsername(scanner.nextLine());
		
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		
		System.out.print("성명: ");
		user.setName(scanner.nextLine());
		
		System.out.print("이름: ");
		user.setEmail(scanner.nextLine());
		
		userRepository.saveUser(user);
		
		System.out.println("===============================");
		System.out.println();
	}
	
	private void findUserByUsername() {
		String username;
		J12_User user;
		
		System.out.println("========<< 회원 조회 >>========");
		System.out.print("사용자이름: ");
		username = scanner.nextLine();
		System.out.println("===============================");
		
		user = userRepository.findUserByUsername(username);
		
		if(userIsNull(user)) {
			System.out.println(getUserDataErrorMessage());
		} else {
			System.out.println(user);
			System.out.print("사용자이름: ");
			System.out.println(user.getUsername());
			System.out.print("비밀번호: ");
			System.out.println(user.getUsername());
			System.out.print("이름: ");
			System.out.println(user.getUsername());
			System.out.print("이메일: ");
			System.out.println(user.getUsername());
			System.out.println("===============================");
		}
		
		System.out.println();
		
	}


	private boolean modifyUserMenu(char select, J12_User user) {
		boolean flag = true;
		
		
		
		while(flag) {
			if(isBack(select)) {
				flag = false;
			} else {
				if (select == '1') {
					flag = changePasswordMenu(user);
				}
			}
		}
		
		return flag;

		
	}
	
	private boolean changePasswordMenu(J12_User user) {
		String password;
		boolean flag = true;
		
		System.out.println("=======<< 비밀번호 변경 >>=======");
		System.out.print("기존의 비밀변호를 입력하세요");
		password = scanner.next();
		scanner.nextLine();
		
		if(user.getPassword().equals(password)) {
			String newPassword1;
			String newPassword2;
			
			System.out.print("새로운 비밀번호를 입력하세요: ");
			newPassword1 = scanner.nextLine();
			System.out.print("새로운 비밀번호를 입력하세요: ");
			newPassword2 = scanner.nextLine();
			
			if(newPassword1.equals(newPassword2)) {
				user.setPassword(newPassword1);
				System.out.println("비밀번호 변경 완료");
				flag = false;
			} else {
				System.out.println("비밀번호가 서로 일치하지 않습니다.");
				flag = false;
			}
			
		} else {
			System.out.println("비밀번호가 서로 일치하지 않습니다.");
			flag = false;
		}
		
		return flag;
		
	}
	
	
	private void changeName() {
		
	}
	
	private void changeEmail() {
		
	}
	
	private boolean mainMenu(char select) {
		boolean flag = true;
		
		if(isExit(select)) {
			flag = false;
			
		} else {
			if (select == '1') {
				showUsers();
			} else if (select == '2') {
				registerUser();
			} else if (select == '3') {
				findUserByUsername();
			} else if (select == '4') {
				boolean loopflag2 = true;
				J12_User user;
				
				user = showModifyUserMenu();
				while(loopflag2) {
					if(user == null) {
						System.out.println(getUserDataErrorMessage());
					} else {
						select = inputSelect("수정");
					}
					loopflag2 = modifyUserMenu(select, user);
				}

				
			} else {
				System.out.println(getSelectedErrorMessage());				
			}
		}
		
		System.out.println();
		
		return flag;
	}
	
	
	
	
	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
	
	private boolean isBack(char select) {
		return select == 'b' || select == 'B';
	}
	
	
	private boolean userIsNull(J12_User user) {
		return user == null;
	}
	
	private boolean isTableLengthZero(J12_User[] users) {
		return users.length == 0;
	}
	
	private String getSelectedErrorMessage() {
		return "###<< 잘못된 입력입니다. 다시 입력하세요. >>###";
	}
	
	private String getUserDataErrorMessage() {
		return "###<< 사용자 정보가 존재하지 않습니다. >>###";
	}

}
