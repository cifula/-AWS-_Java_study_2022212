package j05_입력;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열1: ");
		String str1 = scanner.nextLine();
		// 띄워쓰기와 줄바꿈 사용이 가능함
		
		System.out.println("문자열2: ");
		String str2 = scanner.next();
		// 띄워쓰기와 줄바꿈 사용이 불가능함
		
		System.out.println("정수: ");
		int number1 = scanner.nextInt();
		
		System.out.println("실수: ");
		double number2 = scanner.nextDouble();
		
		System.out.println("문자열1: " + str1);
		System.out.println("문자열2: " + str2);
		System.out.println("정수: " + number1);
		System.out.println("실수: " + number2);
		
		
		
		
		
		
		
		
	}
}
