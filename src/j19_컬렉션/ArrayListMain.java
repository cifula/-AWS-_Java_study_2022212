package j19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		// 값 추가
		strList.add("java");
		strList.add("python");
		System.out.println(strList);
		
		// 지정한 위치에 값 추가
		strList.add(1, "android");
		System.out.println(strList);
		
		// 해당 인덱스의 값을 추출
		System.out.println(strList.get(0));
		String lang = strList.get(1);
		System.out.println(lang);
		
		// 리스트에 해당 값이 있는지 확인(T, F) contains를 이용해 확인
		System.out.println(strList.contains("c++"));
		System.out.println(strList.contains(lang));
		
		// 값 수정
		strList.set(2, "javascript");
		System.out.println(strList);
		
		// 값 삭제
		strList.remove("android");
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
		
		// 리스트의 크기 확인
		System.out.println(strList.size());
		
		// 리스트가 비었는지 확인
		System.out.println(strList.isEmpty());
		
		// 리스트 초기화
		strList.clear();
		System.out.println(strList.isEmpty());
		

		System.out.println("---");
		
		/*
		 * 배열을 리스트로 변환
		 * Array.asList(배열);
		 * 
		 */
		
		String[] langs = {"java", "c++", "python", "javascript"};
		List<String> tempList = Arrays.asList(langs);
		strList.addAll(tempList);
		strList.addAll(2, tempList);
		System.out.println(tempList);
		
		//해당 값의 인덱스 왼쪽부터 찾기
		int findIndexLeft = strList.indexOf("java");
		System.out.println(findIndexLeft);
		int findIndexRight = strList.lastIndexOf("java");
		System.out.println(findIndexRight);
		
		strList.set(1, "java");
		System.out.println(strList);
		strList.subList(strList.indexOf("java") + 1, strList.size()).indexOf("java");
		
		
		// 일반 반복문
		for(int i = 0; i < strList.size(); i++) {
			System.out.println("[" + i + "]: " + strList.get(i));
		}
		
		// 람다식 for each
		strList.forEach(str -> System.out.println("[값2]: " + str));
		System.out.println();
		
		// 반복자 list의 제네릭 타입과 Iterator의 제네릭타입을 맞춰줘야 한다.
		Iterator<String> iterator = strList.iterator();
		while(iterator.hasNext()) {
			String lang2 = iterator.next(); // next()가 값을 하나씩 꺼내준다.
			System.out.println(("[값3]: " + lang2));
		}
		
		Iterator<String> iterator2 = strList.iterator();
		for(int i = 0; i < 4; i++) {
			String lang3 = iterator2.next();
			System.out.println("[값4]: " + lang3);
		}
		
	}

}
