package reviewGUIs;

/**
 * @Class: CIST 2372 Java 2
 * @Term: Fall 2014
 * @Description: Reviewing GUIs
 * 		middle panel 
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 **/
import javax.swing.*;

import java.awt.*;

import javax.swing.JPanel;

public class MiddlePanel extends JPanel {
	 
	
	protected MiddlePanel(){
		setLayout(new GridLayout(5 , 2));
		setBorder(BorderFactory.createBevelBorder(1));
		add(new JLabel("ID: "));
		add(new JTextField());
		add(new JLabel("FirstName: "));
		add(new JTextField());
		add(new JLabel("Last Name: "));
		add(new JTextField());
		add(new JLabel("Email: "));
		add(new JTextField());
		add(new JLabel("GPA: "));
		add(new JTextField());
		
	} // end MiddlePanel constructor
	
} // end MiddlePanel class
