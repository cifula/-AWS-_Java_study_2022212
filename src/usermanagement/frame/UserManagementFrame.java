package usermanagement.frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.google.gson.JsonObject;

import usermanagement.sevice.UserService;

public class UserManagementFrame extends JFrame {

	List<JTextField> loginFields;
	List<JTextField> registerFields;
	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JTextField passwordField;
	private JTextField registerUsernameField;
	private JTextField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UserManagementFrame() {
		loginFields = new ArrayList<>();
		registerFields = new ArrayList<>();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setForeground(new Color(0, 0, 0));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JPanel registerPanel = new JPanel();
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signinLink = new JLabel("Sign in");
		signinLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
				clearField(loginFields);
			}
		});
		signinLink.setFont(new Font("굴림", Font.BOLD, 12));
		signinLink.setForeground(new Color(0, 128, 255));
		signinLink.setHorizontalAlignment(SwingConstants.CENTER);
		signinLink.setBounds(160, 425, 60, 20);
		registerPanel.add(signinLink);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setHorizontalAlignment(SwingConstants.CENTER);
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(40, 140, 300, 35);
		registerPanel.add(registerUsernameField);
		
		registerPasswordField = new JTextField();
		registerPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		registerPasswordField.setColumns(10);
		registerPasswordField.setBounds(40, 200, 300, 35);
		registerPanel.add(registerPasswordField);
		
		registerNameField = new JTextField();
		registerNameField.setHorizontalAlignment(SwingConstants.CENTER);
		registerNameField.setColumns(10);
		registerNameField.setBounds(40, 260, 300, 35);
		registerPanel.add(registerNameField);
		
		registerEmailField = new JTextField();
		registerEmailField.setHorizontalAlignment(SwingConstants.CENTER);
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(40, 320, 300, 35);
		registerPanel.add(registerEmailField);
		
		JLabel logoText = new JLabel("UserManagement");
		logoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setBounds(70, 50, 250, 70);
		loginPanel.add(logoText);
		
		JLabel registerLogoText = new JLabel("UserManagement");
		registerLogoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setBounds(70, 20, 250, 70);
		registerPanel.add(registerLogoText);
		
		JLabel loginText = new JLabel("Login");
		loginText.setFont(new Font("D2Coding", Font.BOLD, 16));
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setBounds(130, 100, 120, 50);
		loginPanel.add(loginText);
		
		JLabel registerLoginText = new JLabel("Register");
		registerLoginText.setFont(new Font("D2Coding", Font.BOLD, 16));
		registerLoginText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLoginText.setBounds(130, 60, 120, 50);
		registerPanel.add(registerLoginText);
		
		usernameField = new JTextField();
		usernameField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameField.setBounds(40, 200, 300, 35);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setColumns(10);
		passwordField.setBounds(40, 270, 300, 35);
		loginPanel.add(passwordField);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setBounds(40, 250, 150, 15);
		loginPanel.add(passwordLabel);
		
		JLabel registerPasswordLabel = new JLabel("Password");
		registerPasswordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerPasswordLabel.setBounds(40, 180, 150, 15);
		registerPanel.add(registerPasswordLabel);
		
		JLabel usernameLabel = new JLabel("User name or email");
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setBounds(40, 180, 150, 15);
		loginPanel.add(usernameLabel);
		
		JLabel registerUsernameLabel = new JLabel("User name or email");
		registerUsernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerUsernameLabel.setBounds(40, 120, 150, 15);
		registerPanel.add(registerUsernameLabel);
		
		JLabel registerNameLabel = new JLabel("Name");
		registerNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerNameLabel.setBounds(40, 240, 150, 15);
		registerPanel.add(registerNameLabel);
		
		JLabel registerEmailLabel = new JLabel("Email");
		registerEmailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerEmailLabel.setBounds(40, 300, 150, 15);
		registerPanel.add(registerEmailLabel);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject loginUser = new JsonObject();
				loginUser.addProperty("usernameAndEmail", usernameField.getText());
				loginUser.addProperty("password", passwordField.getText());
				
				UserService userService = UserService.getInstance();
				Map<String, String> response = userService.authorize(loginUser.toString());
				
				if(response.containsKey("error")) {
					JOptionPane.showMessageDialog(null,response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				JOptionPane.showMessageDialog(null, response.get("ok"),"ok",JOptionPane.INFORMATION_MESSAGE);
				clearField(loginFields);
			}
		});
		loginButton.setBounds(40, 330, 300, 40);
		loginPanel.add(loginButton);
		
		JButton registerButton = new JButton("REGISTER");
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JsonObject userJson = new JsonObject();
				userJson.addProperty("username", registerUsernameField.getText());
				userJson.addProperty("password", registerPasswordField.getText());
				userJson.addProperty("name", registerNameField.getText());
				userJson.addProperty("email", registerEmailField.getText());
				
				System.out.println(userJson.toString());
				
				UserService userService = UserService.getInstance();
				
				Map<String, String> response = userService.register(userJson.toString());
				
				if(response.containsKey("error")) {
					JOptionPane.showMessageDialog(null,response.get("error"), "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				JOptionPane.showMessageDialog(null, response.get("ok"),"ok",JOptionPane.INFORMATION_MESSAGE);
				mainCard.show(mainPanel, "loginPanel");
				clearField(registerFields);

			}
		});
		registerButton.setBounds(40, 375, 300, 40);
		registerPanel.add(registerButton);
		
		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setBounds(80, 390, 150, 20);
		loginPanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");;
			}
		});
		signupLink.setFont(new Font("굴림", Font.BOLD, 12));
		signupLink.setForeground(new Color(0, 128, 255));
		signupLink.setBounds(230, 390, 50, 20);
		loginPanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("Forgot your password?");
		forgotPasswordLink.setFont(new Font("굴림", Font.BOLD, 12));
		forgotPasswordLink.setForeground(new Color(0, 128, 255));
		forgotPasswordLink.setBounds(120, 415, 150, 20);
		loginPanel.add(forgotPasswordLink);
		
		loginFields.add(usernameField);
		loginFields.add(passwordField);
		
		
		registerFields.add(registerUsernameField);
		registerFields.add(registerPasswordField);
		registerFields.add(registerNameField);
		registerFields.add(registerEmailField);
		
	}
	
	private void clearField(List<JTextField> texFields) {
		for(JTextField field : texFields) {
			if(field.getText().isEmpty()) {
				continue;
			}
			field.setText("");
		}
		
	}
}
