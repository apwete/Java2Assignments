package dbWithGUI;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: Populate frame												*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 			Also, implement Listener instead of using inner					*
 * 			listener classes.												*
 * 			v.1.2 - Add DB connections to button listeners					*
 ****************************************************************************/

import javax.swing.JTabbedPane;

public class TabbedPane extends JTabbedPane {
	
	Menu menu = new Menu();
	private Tab1 tp = new Tab1();
	private Tab2 t2 = new Tab2();
	
	public TabbedPane(){
		addMouseListener(menu);
		addTab("This", tp);
		addTab("That", t2);
	}
	
	
}
