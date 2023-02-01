package j12_배열.복습;


import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User {
	private String username;
	private String password;
}

public class Array2 {
	
	public static void main(String[] args) {
		User users1 = new User("aaa", "1234");
		User users2 = new User("bbb", "2222");
		User users3 = new User("ccc", "3333");
		
		
		User[] users = new User[] {
			new User("aaa", "1234"),
			new User("bbb", "2222"),
			new User("ccc", "3333")
		};
		
		users[0] = new User("aaa", "1234");
		users[1] = new User("bbb", "2222");
		users[2] = new User("ccc", "3333");
		
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].getUsername());
		}
		
		for(User u : users) {
			System.out.println(u);
		}
		
		List<User> userList = Arrays.asList(users);
		System.out.println(userList);
	}
}
