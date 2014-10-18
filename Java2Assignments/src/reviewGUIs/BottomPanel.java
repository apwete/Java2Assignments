package reviewGUIs;

/**
 * @Class: CIST 2372 Java 2
 * @Term: Fall 2014
 * @Description: Reviewing GUIs
 * 		bottom panel
 * 
 * @author: William M. Driver
 * @version: 1.0
 * 
 **/

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BottomPanel extends JPanel {
	JButton find = new JButton("Find");
	JButton insert = new JButton("Insert");
	JButton delete = new JButton("Delete");
	JButton update = new JButton("Update");
	JButton exit = new JButton("Exit");
	
	protected BottomPanel(){
		find.setToolTipText("Click to find a student");
		insert.setToolTipText("Click to add student to database.");
		delete.setToolTipText("Click to delete student from database");
		update.setToolTipText("Click to update student info");
		exit.setToolTipText("Click to exit program");
		
		exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
            	        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            		 System.exit(0);
            	} // end if
            } // end action listener event
        }); // end action listener
		
		add(find);
		add(insert);
		add(delete);
		add(update);
		add(exit);
		
	} // end BottomPanel constructor

} // end BottomPanel class
