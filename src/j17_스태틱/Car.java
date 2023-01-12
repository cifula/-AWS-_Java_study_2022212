package j17_스태틱;

import java.time.LocalDateTime;
import java.util.Date;

public class Car {
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	
	public final String CODE  = "KIA-" + NOW_YEAR + "-";
	public static int ai = 1;
	
	private String modelName;
	private String serialCode;
	
	
	public Car(String modelName) {
		this.modelName =modelName;
		this.serialCode = CODE + String.format("%04d", ai);
		
		ai++;
	}


	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", serialCode=" + serialCode + "]";
	}
	



	
	
	
	
	

}
