package dbWithGUI;


/**
 * @Class: CIST 2372 Java 2
 * @Term: Fall 2014
 * @author: William M. Driver
 * @date: 09/01/2014
 * @Description: More on GUIs
 * 		Main and constructor 
 * 
 * @version: 1.1 
 * @update: Adding JTabbedPane and a PopupMenu
 * 			Also, implement Listener instead of using inner
 * 			listener classes.
 **/

import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;

public class MiddlePanel extends JPanel {
	private JTextField id = new JTextField();
	private JTextField fname = new JTextField();
	private JTextField lname = new JTextField();
	private JTextField email = new JTextField();
	private JTextField gpa = new JTextField();
	
	public MiddlePanel(){
		setLayout(new GridLayout(5 , 2));
		setBorder(BorderFactory.createBevelBorder(1));
		add(new JLabel("ID: "));
		add(id);
		add(new JLabel("FirstName: "));
		add(fname);
		add(new JLabel("Last Name: "));
		add(lname);
		add(new JLabel("Email: "));
		add(email);
		add(new JLabel("GPA: "));
		add(gpa);	
	} // end MiddlePanel constructor
} // end MiddlePanel class
