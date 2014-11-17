package dbWithGUI;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  10																*
 * @author: William M. Driver 												*
 * @date: 11/15/2014 														*
 * @Description: Buttons/ DB Connections									*
 * 																			*
 * @version: 1.2 															*
 * @update: v: 1.1 - Adding JTabbedPane and a PopupMenu						*
 * 					Also, implement Listener instead of using inner			*
 * 					listener classes.										*
 * 			v.1.2 - Add DB connections to button listeners, Student	Object	* 
 * 					and inputs for address									*
 ****************************************************************************/

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
	
	/************************* Constructors *****************************/
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
		
		/******** 			Behaviors			****************/
		Student s1;
		MiddlePanel input = null;
		int id;
		String fn;
		String ln;
		String street;
		String city;
		String state;
		String email;
		int zip;
		int gpa;
		
		if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
       	        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
       		 System.exit(0);
       	} // Exit button
        else
        {
        	s1 = new Student();
        	id = input.getID();
        	
        	if(evt.getSource() == find)
        	{
        		s1.selectDB(id);
        	} // Find button
        	else
        	{
        		if(evt.getSource() == insert)
        		{
        			fn = input.getFirstName();
        			ln = input.getLastName();
        			street = input.getStreet();
        			city = input.getCity();
        			state = input.getState();
        			email = input.getEmail();
        			zip = input.getZip();
        			gpa = input.getGPA();
        			
        			s1.insertDB(id, fn, ln, street, city, state, email, zip, gpa);
        		} // Insert button
        		else if(evt.getSource() == delete)
        		{
        			s1.deleteDB();
        		} // Delete button
        		else if(evt.getSource() == update)
        		{
        			s1.updateDB();
        		} // Update button
        	}
        }// Other buttons
        	
    } // end action listener event
} // end BottomPanel class














































