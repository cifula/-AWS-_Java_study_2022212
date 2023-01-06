package j09_클래스;

import java.util.Scanner;

public class J09_UserMain {

	public static void main(String[] args) {
		J09_User user1 = new J09_User();
		J09_User user2 = new J09_User();
		J09_User user3 = new J09_User();
		
		user1.username = "aaa";
		user1.password = "1234";
		user1.name = "김종환";
		user1.email = "aaa@gmail.com";
		
		user1.printInfo();
		
		user2.username = "lidel95";
		user2.password = "5138";
		user2.name = "박성진";
		user2.email = "lidel95@gmail.com";
		
		user2.printInfo();

		user2.changeInfo();
		
		user2.printInfo();
	}
}
