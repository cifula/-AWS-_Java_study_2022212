package j19_컬렉션.TCPEx;


import java.util.ArrayList;

public class Collection01 {
	public static void main(String[] args) {
		// 리스트 생성
		ArrayList<String> arrList = new ArrayList<String>();
		
		//리스트 요소의 저장
		arrList.add("4");
		arrList.add("2");
		arrList.add("3");
		arrList.add("1");
		
		//리스트 요소의 출력
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
	}

}
