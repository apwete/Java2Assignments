package reviewGUIs;

/**
 * @Class: CIST 2372 Java 2
 * @Term: Fall 2014
 * @Description: Set up a simple JFrame
 * 				Packs the frame
 * 				Default Close
 *              No relative location
 *              
 * @author: William M. Driver
 * @version: 1.0
 * 
 **/

import javax.swing.JFrame;

public class SimpleFrame extends JFrame{
	
	public Object frame(){
		SimpleFrame frame = new SimpleFrame();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		return frame;	
	} // end frame Object method
	
} // end SimpleFrame class
