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

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tab2 extends JPanel {
	private JLabel jLbl1 = new JLabel("Right Click for Windows");
	private JLabel jLbl2 = new JLabel("or");
	private JLabel jLbl3 = new JLabel("Double click on Mac");

	public Tab2() {
		setLayout(new GridLayout(3, 1));
		jLbl1.setFont(new Font("Serif", Font.BOLD, 24));
		jLbl1.setForeground(Color.GREEN);
		jLbl1.setHorizontalAlignment(JLabel.CENTER);

		jLbl2.setFont(new Font("Serif", Font.BOLD, 24));
		jLbl2.setForeground(Color.ORANGE);
		jLbl2.setHorizontalAlignment(JLabel.CENTER);

		jLbl3.setFont(new Font("Serif", Font.BOLD, 24));
		jLbl3.setForeground(Color.CYAN);
		jLbl3.setHorizontalAlignment(JLabel.CENTER);

		add(jLbl1);
		add(jLbl2);
		add(jLbl3);
	} // end Tab2 constructor
} // end Tab 2 class
