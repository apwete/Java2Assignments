package dbWithGUI;


/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: 															*
 * 		Main and constructor 												*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 					Also, implement Listener instead of using inner			*
 * 					listener classes.										*
 * 			v.1.2 - Add DB connections to button listeners, Student	Object	* 
 * 					and inputs for address									*
 ****************************************************************************/

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StudentData extends JFrame {
	
	Menu menu = new Menu();
	TabbedPane tp = new TabbedPane();
	
	public StudentData(){
		
		JPanel p1 = new JPanel();
		p1.setLayout( new BorderLayout());

		add(p1, BorderLayout.NORTH);
		add(tp, BorderLayout.CENTER);	
	} // end StudentData constructor
	
	public static void main(String[] args) {
		StudentData frame = new StudentData();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}// end main
}// end StudentData class