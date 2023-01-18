package usermanagement.entity;

public class LoginInstance {
	
	
	private User userData;
	
	private static LoginInstance instance;
	
	

	private LoginInstance() {
		userData = new User(null, null, null, null);
	}

	public static LoginInstance getInstance() {
		if(instance == null) {
			instance = new LoginInstance();
		}
		
		return instance;
	}

	public User getUserData() {
		return userData;
	}

	public void setUserData(User userData) {
		this.userData = userData;
	}
	
	
	
	
}
