package j24_람다;

@FunctionalInterface
//함수형인터페이스 = 람다형이다라고 지정을 해준다.
//메소드를 하나만 사용해야한다.
//default 메소드는 몇개가 있던 상관없다.
public interface Instrument {
	
	public String play(String instrument);

	public default void testPrint() {
		System.out.println("테스트");
	}

}
