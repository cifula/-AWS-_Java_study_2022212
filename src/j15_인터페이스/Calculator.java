package j15_인터페이스;

public interface Calculator {
	
	public int ERROR = -9999999; // 인터페이스에서는 final을 생략해도 상수로 생성됨
	
	public double plus(double x, double y);
	
	public double minus(double x, double y);
	
	public default double multiplcation(double x, double y) {
		return x * y;
	}
	
	public double division(double x, double y);
	
}
