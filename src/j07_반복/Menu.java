package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			// 식당 메뉴 출력
			System.out.println("========<<식당 메뉴>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("=============================");
			System.out.println("q. 프로그램 종료");
			System.out.println("=============================");
			
			// 식당 입력
			System.out.println("식당 번호 선택: ");
			select = scanner.next().charAt(0);
			
			// 식당 메뉴 조작
			if (select == 'q' || select == 'Q') {
				loopFlag1 = false;
				

			} else if (select == '1') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					// 메뉴 출력
					System.out.println("========<< 김밥천국 >>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					// 메뉴 입력
					System.out.println("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					// 뒤로가기, 프로그램 종료
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
						
					} else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("돌솥비빔밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("오므라이스을 선택했습니다.");
					} else if (select == '4') {
						System.out.println("김치볶음밥을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
					
				}
				
				
			} else if (select == '2') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					// 메뉴 출력
					System.out.println("========<< 탄 탄 면 >>========");
					System.out.println("1. 탄탄면");
					System.out.println("2. 얼큰탄탄국밥");
					System.out.println("3. 사천탄탄면");
					System.out.println("4. 마라탄탄면");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					// 메뉴 입력
					System.out.println("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					// 뒤로가기, 프로그램 종료
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
						
					} else if (select == '1') {
						System.out.println("탄탄면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("얼큰탄탄면을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("사천탄탄면을 선택했습니다.");
					} else if (select == '4') {
						System.out.println("마라탄탄면을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
					
				}
				
			} else if (select == '3') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					// 메뉴 출력
					System.out.println("========<< 홍대개미 >>========");
					System.out.println("1. 스테이크 덮밥");
					System.out.println("2. 포크슬라이스 덮밥");
					System.out.println("3. 막창 덮밥");
					System.out.println("4. 고기 온면");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					// 메뉴 입력
					System.out.println("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					// 뒤로가기, 프로그램 종료
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
						
					} else if (select == '1') {
						System.out.println("스테이크 덮밥을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("포크슬라이스 덮밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("막창 덮밥을 선택했습니다.");
					} else if (select == '4') {
						System.out.println("고기 온면을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
					
				}
				
			} else if (select == '4') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					// 메뉴 출력
					System.out.println("========<< 밥 앤 밥 >>========");
					System.out.println("1. 오징어 김밥");
					System.out.println("2. 스팸 김밥");
					System.out.println("3. 멸치 김밥");
					System.out.println("4. 참치 김밥");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					// 메뉴 입력
					System.out.println("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					// 뒤로가기, 프로그램 종료
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
						
					} else if (select == '1') {
						System.out.println("오징어 김밥을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("스팸 김밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("멸치 김밥을 선택했습니다.");
					} else if (select == '4') {
						System.out.println("참치 김밥을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
					
				}
				
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
				
				
				
			
			System.out.println();
		}
		
		System.out.println("프로그램 정상 종료");
		
	
	}
}
