package dbWithGUI;


/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: Input fields												*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 					Also, implement Listener instead of using inner			*
 * 					listener classes.										*
 * 			v.1.2 - Add DB connections to button listeners, Student	Object	* 
 * 					and inputs for address									*
 ****************************************************************************/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MiddlePanel extends JPanel {
	/******** 			Behaviors			****************/
	private JTextField id = new JTextField();
	private JTextField fname = new JTextField();
	private JTextField lname = new JTextField();
	private JTextField street = new JTextField();
	private JTextField city = new JTextField();
	private JTextField state = new JTextField();
	private JTextField zip = new JTextField();
	private JTextField email = new JTextField();
	private JTextField gpa = new JTextField();
	
	private int inputID = Integer.parseInt(id.getText());
	private String inputFN = fname.getText();
	private String inputLN = lname.getText();
	private String inputStreet = street.getText();
	private String inputCity = city.getText();
	private String inputState = state.getText();
	private int inputZIP = Integer.parseInt(zip.getText());
	private String inputEmail = email.getText();
	private int inputGPA = Integer.parseInt(gpa.getText());
	
	/******** 			Constructors		 ***************/
	public MiddlePanel(){
		setLayout(new GridLayout(5 , 2));
		setBorder(BorderFactory.createBevelBorder(1));
		add(new JLabel("ID: "));
		add(id);
		add(new JLabel("FirstName: "));
		add(fname);
		add(new JLabel("Last Name: "));
		add(lname);
		add(new JLabel("Street: "));
		add(street);
		add(new JLabel("City: "));
		add(city);
		add(new JLabel("State: "));
		add(state);
		add(new JLabel("Zip: "));
		add(zip);
		add(new JLabel("Email: "));
		add(email);
		add(new JLabel("GPA: "));
		add(gpa);	
	} // end MiddlePanel constructor

	/*********			 getters			 ***************/
	protected int getID() {
		return inputID;
	}
	
	protected String getFirstName() {
		return inputFN;
	} // end get FirstName
	
	protected String getLastName() {
		return inputLN;
	} // end getLastName

	protected String getStreet() {
		return inputStreet;
	} // end getStreet

	protected String getCity() {
		return inputCity;
	} // end getCity
	
	protected String getState() {
		return inputState;
	} // end getState

	protected int getZip() {
		return inputZIP;
	} // end getZip

	protected String getEmail() {
		return inputEmail;
	} // end getEmail

	protected int getGPA() {
		return inputGPA;
	} // end getGPA
} // end MiddlePanel class
