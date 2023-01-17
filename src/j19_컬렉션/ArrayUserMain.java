package j19_컬렉션;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User {
	private String username;
	private String name;
}

public class ArrayUserMain {
	
	public static void main(String[] args) {
//		User[] userArray = {
//				new User("aaa", "김종환"),
//				new User("bbb", "고병수"),
//				new User("ccc", "손민재"),
//				new User("ddd", "황창욱")
//		};
	}
	
	private static User searchUser(List<User> userList, String username) {
		User user = null;
		
		return user;
	}
}
