package j08_메소드;

public class Method2 {

		// 매개변수: x, 반환: x
		public static void method1() {
			System.out.println("단순 실행");
		}
		
		// 매개변수: int 하나 입력, 반환: x
		public static void method2(int num) {
			System.out.println("num: " + num);
		}
		
		// 매개변수: int 두개 입력, 반환: x
		public static void method3(int num, int num2) {
			System.out.println("num: " +num);
			System.out.println("num2: " +num2);
			System.out.println();
		}
	
		public static String method4() {
			return "데이터 반환"; // 반드시 하나의 데이터만 반환할 수 있다.
		}
		
		public static String method5(int age) {
			return age + "살";
		}
		
		public static void main(String[] args) {
			method1(); // 함수 호출(function call, call)
			method2(100);
			method3(200, 300);
			
			System.out.println(method4());
			System.out.println();
		
			String data1 = method4();
			System.out.println(method4());
			System.out.println();
			
			System.out.println(method5(28));
			System.out.println();
			
			
		}
}
