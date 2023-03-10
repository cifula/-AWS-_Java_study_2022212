package usermanagement.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.RoleDtl;
import usermanagement.entity.User;
import usermanagement.repository.UserRepository;
import usermanagement.repository.UserRepositoryArrayList;

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
		
		if(duplicatedUsername(user.getUsername())) {
			response.put("error", "이미 사용중인 사용자 이름입니다.");
			return response;
		}
		
		if(duplicatedEmail(user.getEmail())) {
			response.put("error", "이미 사용중인 이메일입니다.");
			return response;
		}
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));

		repository.saveUser(user);
		RoleDtl roledtl = RoleDtl.builder()
				.roleId(3)
				.userId(user.getUserId())
				.build();
		
		repository.saveRoleDtl(roledtl);
		
		List<RoleDtl> roleDtls = new ArrayList<>();
		
		roleDtls.add(roledtl);
		
		response.put("ok", "회원가입 성공.");
		user.setRoleDtls(roleDtls);
		System.out.println(user);
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
		
		
		String usernameAndEmail = loginUser.get("usernameAndEmail");
		
		User user = repository.findUserByUsername(usernameAndEmail);
		if(user == null) {
			user = repository.findUserByEmail(usernameAndEmail);
			if(user == null) {
				response.put("error", "사용자 정보를 확인해주세요");
				return response;
			}
		}
		
		if(!BCrypt.checkpw(loginUser.get("password"), user.getPassword())) {
			response.put("error", "사용자 정보를 확인해주세요");
			return response;
		}
		
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
