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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BottomPanel extends JPanel implements ActionListener{
	private JButton find = new JButton("Find");
	private JButton insert = new JButton("Insert");
	private JButton delete = new JButton("Delete");
	private JButton update = new JButton("Update");
	private JButton exit = new JButton("Exit");
	
	public BottomPanel(){
		find.setToolTipText("Click to find a student");
		insert.setToolTipText("Click to add student to database.");
		delete.setToolTipText("Click to delete student from database");
		update.setToolTipText("Click to update student info");
		exit.setToolTipText("Click to exit program");
		exit.addActionListener(this); // end action listener
		
		add(find);
		add(insert);
		add(delete);
		add(update);
		add(exit);	
	} // end BottomPanel constructor

	public void actionPerformed(ActionEvent evt) {
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
       	        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
       		 System.exit(0);
       	} // end if
    } // end action listener event
} // end BottomPanel class
