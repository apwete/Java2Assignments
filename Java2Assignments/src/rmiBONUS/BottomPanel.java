package rmiBONUS;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  RMI Bonus																*
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
 * 			v: 1.3 - Implement RMI											*
 ****************************************************************************/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.rmi.*;
import java.rmi.registry.*;

public class BottomPanel extends JPanel implements ActionListener{
	/************************** Behaviors *******************************/
	private StudentInterface rmi;
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
		
		Registry reg;
		try {
			reg = LocateRegistry.getRegistry("localhost");
			rmi =(StudentInterface)reg.lookup("Student");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
       	        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
       		 System.exit(0);
       	} // Exit button
        else
        {
        	
        	id = rmi.getID();
        	try {
        	if(evt.getSource() == find)
        	{
        		
					rmi.selectDB(id);
				
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
        			
        			rmi.insertDB(id, fn, ln, street, city, state, email, zip, gpa);
        		} // Insert button
        		else if(evt.getSource() == delete)
        		{
        			rmi.deleteDB();
        		} // Delete button
        		else if(evt.getSource() == update)
        		{
        			rmi.updateDB();
        		} // Update button
        		
        	}
        	} catch (RemoteException e) {
					e.printStackTrace();
				}
        }// Other buttons
        	
    } // end action listener event
} // end BottomPanel class