package j24_람다;

public class Lambda1 {
	
	public static void main(String[] args) {
		
//		Instrument instrument = new Instrument() {
//			
//			@Override
//			public String play(String instrument) {
//				return instrument + "을(를) 연주합니다.";
//			}
//		};
//		System.out.println(instrument.play("피아노"));
//		instrument.testPrint();
		
		//기본적인 람다식의 형태
		
		Instrument instrument2 = (String instrument) -> {
			return instrument + "을(를) 연주합니다.";
		};
		System.out.println(instrument2.play("바이올린"));
		
		// 1.
		// 매개변수의 자료형을 생략할 수 있다.
		
		Instrument instrument3 = (instrument) -> {
			return instrument + "을(를) 연주합니다.";
		};
		System.out.println(instrument3.play("바이올린"));
		
		// 2.
		// 매개변수의 이름을 바꿀 수 있다.
		Instrument instrument4 = (itm) -> {
			return itm + "을(를) 연주합니다.";
		};
		System.out.println(instrument4.play("바이올린"));
		
		// 3.
		// 매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다.
		Instrument instrument5 = itm -> {
			return itm + "을(를) 연주합니다.";
		};
		System.out.println(instrument5.play("바이올린"));
		
		// 4.
		// 구현부의 실행문(명령문)이 하나일 때 중괄호를 생략할 수 있다.		﻿
		// 이때 리턴자료형이 정해져있으면 리턴값으로 사용이 된다.
		Instrument instrument6 = itm -> itm + "을(를) 연주합니다.";
		System.out.println(instrument6.play("바이올린"));
		
		// 5.
		// 지역변수를 람다식안에 사용할 수 있다.
		String encore = "앵콜곡을 연주합니다.";
		
		Instrument instrument7 = itm -> itm + "을(를) 연주합니다." + encore;
		
		System.out.println(instrument7.play("리코더"));
		
		
	}
}
