package j06_조건;

import java.util.Scanner;

public class Conditional3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		
		System.out.println("점수 입력: ");
		score = scanner.nextInt();

		// score에 따라 grade 값을 반환만 하게끔 코드 작성
		if (score < 0 || score > 100) {
			grade = null;
		} else if (score > 89) {
			grade = "A";
		} else if (score > 79) {
			grade = "B";
		} else if (score > 69) {
			grade = "C";
		} else if (score > 59) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		// 학점에 '+'를 붙일지 말지만 결정
		if ((score > 59 && score < 101) && (score % 10 > 4 || score == 100)) {
			grade += "+";
		}
		
		// grade 값을 받아서 출력만 하게끔 코드 작성		
		if (grade == null) {
			System.out.println("계산불가");
		} else {
			System.out.println("점수(" + score + "): " + grade + "학점");
		}
			
		

		
	}
}
