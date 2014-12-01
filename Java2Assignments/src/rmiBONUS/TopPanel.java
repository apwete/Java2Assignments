package rmiBONUS;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: Top panel / Title											*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 					Also, implement Listener instead of using inner			*
 * 					listener classes.										*
 * 			v.1.2 - Add DB connections to button listeners, Student	Object	* 
 * 					and inputs for address									*
 ****************************************************************************/

import java.awt.FlowLayout;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	private JLabel jLbl = new JLabel("Student Information");
	
	public TopPanel(){
		setLayout(new FlowLayout());
		jLbl.setFont(new Font("Serif", Font.BOLD, 24));
		jLbl.setForeground(Color.GREEN);
		add(jLbl);		
	}// end TopPanel constructor
} // end TopPanel class
