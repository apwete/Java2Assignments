package moreGUI;

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
