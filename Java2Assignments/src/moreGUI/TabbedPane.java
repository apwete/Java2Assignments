package moreGUI;

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
