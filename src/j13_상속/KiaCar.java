package j13_상속;

public class KiaCar extends Car {
	
	public KiaCar() {
		super();
		System.out.println("자식");
	}
	
	@Override
	public int discountPrice(int percentage) {
		// TODO Auto-generated method stub
		return super.discountPrice(percentage);
	}

}
