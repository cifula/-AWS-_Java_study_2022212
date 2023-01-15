package j18_제네릭.TCPEx;

public class Generic01<T> {
	
	T element;
	
	void setElement(T element) {
		this.element = element;
	}
	
	T getElement() {
		return element;
	}
	
	public static void main(String[] args) {
		Generic01<Integer> tcp = new Generic01<Integer>();
		
		tcp.setElement(123);
		
		
		System.out.println(tcp.getElement());
		
	}
}
