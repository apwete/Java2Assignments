package dbWithGUI;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: Popup menu													*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 					Also, implement Listener instead of using inner			*
 * 					listener classes.										*
 * 			v.1.2 - Add DB connections to button listeners, Student	Object	* 
 * 					and inputs for address									*
 ****************************************************************************/

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Menu extends JFrame implements MouseListener{
	
	private JPopupMenu pop = new JPopupMenu();
	private JMenuItem mNewtab = new JMenuItem("New Tab");
	private JMenuItem mNewWindow = new JMenuItem("New Window");
	private JMenuItem mCopy = new JMenuItem("Copy");
	
	public Menu(){
		pop.add(mNewtab);
		pop.addSeparator();
		pop.add(mNewWindow);
		pop.addSeparator();
		pop.add(mCopy);
	} // end menu constructor
	
	public void mouseClicked(MouseEvent e) {
		showPopup(e);
	} // end MouseClicked

	public void mouseEntered(MouseEvent e) {
		showPopup(e);
	} // end MouseEntered

	public void mouseExited(MouseEvent e) {
		showPopup(e);
	} // end MouseExited

	public void mousePressed(MouseEvent e) {
		showPopup(e);
	} // end MousePressed 

	public void mouseReleased(MouseEvent e) {
		showPopup(e);
	} // end MouseReleased

	private void showPopup(MouseEvent e) {
		if(e.isPopupTrigger()){
			pop.show(e.getComponent(), e.getX(), e.getY());
		} // end if
	} // end showPopup
} // end menu class
