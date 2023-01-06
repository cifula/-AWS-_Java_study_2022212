package j04_연산자;

public class Operation6 {
	public static void main(String[] args) {
		/*
		 * 시험 성적을 학점으로 계산하는 프로그램 
		 * 
		 * 정수자료형 score 변수 선언
		 * 88점으로 초기화
		 * 
		 * 조건
		 * score가 0점보다 작거나 100점보다 크면 X를 출력
		 * score가 90 ~ 100점이면 A학점
		 * score가 80 ~ 100점이면 B학점
		 * score가 70 ~ 100점이면 C학점
		 * score가 60 ~ 100점이면 D학점
		 * score가 0 ~ 100점이면 F학점
		 */
		
		int score = 95;
		
		char grade = score < 0 || score > 100 ? 'X' 
				: score / 90 == 1 ? 'A'
				: score / 80 == 1 ? 'B'
				: score / 70 == 1 ? 'C'
				: score / 60 == 1 ? 'D' : 'F';
		
		

		System.out.println(score % 10 > 4 || score == 100 
				? "점수(" + score + "): " + grade + "+ 학점" 
				: "점수(" + score + "): " + grade + "학점");
		

		
//		char grade2 = score < 0 || score > 100 ? 'X'
//				: score / 10 > 8 ? 'A'
//				: score / 10 > 7 ? 'B'
//				: score / 10 > 6 ? 'C'
//				: score / 10 > 5 ? 'D' : 'F';
//				
//		System.out.println("점수(" + score + "): " + grade2 + "학점");
//		
//		
//		char grade3 = score < 0 || score > 100 ? 'X'
//				: score - 90 > 0 || score - 90 == 0 ? 'A'
//				: score - 80 > 0 || score - 80 == 0 ? 'B'
//				: score - 70 > 0 || score - 70 == 0 ? 'C'
//				: score - 60 > 0 || score - 60 == 0 ? 'D' : 'F';
//
//					
//		System.out.println("점수(" + score + "): " + grade3 + "학점");
//		
//		
//		char grade4 = score < 0 || score > 100 ? 'X'
//				: score < 60 ? 'F'
//				: score % 60 < 10 ? 'D'
//				: score % 70 < 10 ? 'C'
//				: score % 80 < 10 ? 'B' : 'A';
//					
//		System.out.println("점수(" + score + "): " + grade4 + "학점");
		
				
		
	}

}
