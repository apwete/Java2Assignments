package reviewGUIs;

/**
 * @Class: CIST 2372 Java 2
 * @Term: Fall 2014
 * @Description: Reviewing GUIs
 * 		holds the top panel 
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 **/

import java.awt.FlowLayout;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	private JLabel jLbl = new JLabel("Student Information");
	
	protected TopPanel(){
		setLayout(new FlowLayout());
		jLbl.setFont(new Font("Serif", Font.BOLD, 24));
		jLbl.setForeground(Color.GREEN);
		add(jLbl);
		
	}// end TopPanel constructor
	
} // end TopPanel class
