package usermanagement.sevice;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.LoginInstance;
import usermanagement.entity.User;
import usermanagement.repository.UserRepository;

public class UserService {
	
	private UserRepository repository;
	private Gson gson;
	
	private static UserService instance;
	
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	private UserService() {
		repository = UserRepository.getInstance();
		gson = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public Map<String, String> register(String userJson) {
		// response: 응답
		Map<String, String> response = new HashMap<>();
		
		Map<String, String> userMap = gson.fromJson(userJson, Map.class);
		for(Entry<String, String> userEntry : userMap.entrySet()) {
			if(userEntry.getValue().isBlank()) {
				response.put("error", userEntry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		
		User user = gson.fromJson(userJson, User.class);
		System.out.println("서비스에 넘어옴! User 객체로 변환");
		System.out.println(user);
		
		if(duplicatedUsername(user.getUsername())) {
			response.put("error", "이미 사용중인 사용자 이름입니다.");
			return response;
		}
		
		if(duplicatedEmail(user.getEmail())) {
			response.put("error", "이미 사용중인 이메일입니다.");
			return response;
		}
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		System.out.println(user);
		repository.saveUser(user);
		
		response.put("ok", "회원가입 성공.");
		
		return response;
	}
	

	public Map<String, String> authorize(String loginUserJson) {
		Map<String, String> loginUser = gson.fromJson(loginUserJson, Map.class);
		
		Map<String, String> response = new HashMap<>();
		
		for(Entry<String, String> entry : loginUser.entrySet()) {
			if(entry.getValue().isBlank()) {
				response.put("error", entry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		

		User user = gson.fromJson(userJson, User.class);
		
		System.out.println(user);
		
		if(duplicatedUsername(user.getUsername())) {
			response.put("error", "사용자 정보가 잘못되었습니다.");
			return response;
		}
		
		User user2 = repository.findUserByUsername(user.getUsername());

		if(!BCrypt.checkpw(user.getPassword(), user2.getPassword())) {
			response.put("error", "사용자 정보가 잘못되었습니다.");
		}
		
		LoginInstance.getInstance().setUserData(user2);
		response.put("ok", "로그인에 성공하셨습니다.");

		
		response.put("ok", user.getName() + "님 환영합니다.");
		return response;
	}
	
	private boolean duplicatedUsername(String username) {
		return repository.findUserByUsername(username) != null;
	}
	
	private boolean duplicatedEmail(String email) {
		return repository.findUserByEmail(email) != null;
	}


}
