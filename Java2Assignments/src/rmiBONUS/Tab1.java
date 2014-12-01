package rmiBONUS;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: Populate tab 1												*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 					Also, implement Listener instead of using inner			*
 * 					listener classes.										*
 * 			v.1.2 - Add DB connections to button listeners, Student	Object	* 
 * 					and inputs for address									*
 ****************************************************************************/

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Tab1 extends JPanel{

	TopPanel top = new TopPanel();
	MiddlePanel mid = new MiddlePanel();
	BottomPanel bottom = new BottomPanel();
	
	public Tab1(){
		setBorder(new EmptyBorder(10,10,10,10));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(top, BorderLayout.NORTH);
		p2.add(mid, BorderLayout.CENTER);
		p2.add(bottom, BorderLayout.SOUTH);
		
		add(p2);
	} // end StudentData constructor
} // end TabPane class