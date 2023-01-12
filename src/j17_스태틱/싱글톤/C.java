package j17_스태틱.싱글톤;

public class C {
	
	public void showAll() {
		System.out.println("학생 목록");
		A.getInstance().showStudents();
	}

}
