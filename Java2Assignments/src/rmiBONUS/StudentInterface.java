package rmiBONUS;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  RMI Bonus															*
 * @author: William M. Driver 												*
 * @date: 11/30/2014 														*
 * @Description: RMI Interface												*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import java.rmi.*;

public interface StudentInterface extends Remote {

	/*********			 SelectDB			 ***************/
	public void selectDB(int sid) throws RemoteException;
	/*********			 UpdateDB			 ***************/
	public  void updateDB();
	/*********			 InsertDB			 ***************/
	public  void insertDB(int id, String fn, String ln, String street, String city, 
			String state, String email, int zip, int gpa);
	/*********			 DeleteDB			 ***************/
	public  void deleteDB();
	/*********			 Display			 ***************/
	public  void display();

	/********* 		getters and setters		 ***************/
	public  int getID();
	
	public  String getFirstName();

	public  void setFirstName(String fn);
	
	public  String getLastName();

	public  void setLastName(String ln);

	public  String getStreet();

	public  void setStreet(String street);

	public  String getCity();

	public  void setCity(String city);
	
	public  String getState();

	public  void setState(String state);
	
	public  int getZip();

	public  void setZip(int zip);
	
	public  String getEmail();

	public  void setEmail(String email);

	public  int getGPA();

	public  void setGPA(int gpa);
}