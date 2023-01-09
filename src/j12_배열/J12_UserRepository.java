package j12_배열;

/// 저장소
public class J12_UserRepository {

	
	private J12_User[] userTable;

	public J12_UserRepository(J12_User[] userTable) {
		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() {
		return userTable;
	}
	
	// userTable에 새로운 user 값 추가
	public void saveUser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length - 1] = user;
	}
	
	// userTable 배열의 길이를 length 만큼 확장
	private void extendArray(int length) {
		J12_User[] newArray = new J12_User[userTable.length + length];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	// userTable 배열의 길이를 1만큼 확장
	private void extendArrayOne() {
		J12_User[] newArray = new J12_User[userTable.length + 1];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	// 길이가 늘어난 새로운 배열에 기존 배열의 값을 입력
	private void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}
	
	public J12_User findUserByUsername(String username) {
		
		J12_User user = null;
		
		for(J12_User u : userTable) {
			if(u == null) {
				System.out.println("존재하지 않는 사용자 입니다.");
				continue;
			}
		}
		
		for(J12_User u : userTable) {
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			}
		}
		
		return user;
	}
	

	
	
}
