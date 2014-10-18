package reviewGUIs;

/**
 * @Class: CIST 2372 Java 2
 * @Term: Fall 2014
 * @Description: Reviewing GUIs
 * 		Main and constructor 
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 **/

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StudentData extends JFrame{
	TopPanel top = new TopPanel();
	MiddlePanel mid = new MiddlePanel();
	BottomPanel bottom = new BottomPanel();
	
	public StudentData(){
		JPanel p1=new JPanel();
		p1.setBorder(new EmptyBorder(10,10,10,10));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(top, BorderLayout.NORTH);
		p2.add(mid, BorderLayout.CENTER);
		p2.add(bottom, BorderLayout.SOUTH);
		
		p1.add(p2);
		
		add(p1);
	} // end StudentData constructor
	
	public static void main(String[] args) {
		StudentData frame = new StudentData();
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}// end main

}// end StudentData class
