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