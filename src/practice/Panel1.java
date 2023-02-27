package practice;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;

public class Panel1 extends JPanel {


	public Panel1() {
		setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton, "name_2965370138274000");
		

	}

}
