package j07_반복;

public class Star {
	
	public static void main(String[] args) {
		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10 - i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 9 - i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 0; k < i + 1; k++) {
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 0; k < 10 - i; k++) {
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}

		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 9 - i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 0; k < i * 2 + 1; k++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 0; k < 20 - i * 2; k++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
		
		for(int i = 0; i < 19; i++) {
			for(int j = 0; i < 10 ? j < 9 - i : j < i - 9; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; i < 10 ? k < i * 2 + 1 : k < 37 - i * 2 ; k++) {
				System.out.print("*");
			}

		
			System.out.println();
		}
		
		


		
		
		
	}

}
