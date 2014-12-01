package rmiBONUS;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  Rmi Bonus																	*
 * @author: William M. Driver 												*
 * @date: 11/11/2014 														*
 * @Description: DB Student Object 											*
 *  																		*
 * @version: 1.0 															* 
 * @update: v: 1.1 - housekeeping											*
 * 			v: 1.2 - Add DB connections to button listeners, Student Object	* 
 * 					 and inputs for address									*
 * 			v: 1.3 - Implement RMI											*
 ****************************************************************************/

import java.sql.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class StudentServer extends UnicastRemoteObject implements StudentInterface {
	/******** 			Behaviors			****************/
	private Registry reg;
	
	int sid;
	String sfn;
	String sln;
	String sstreet;
	String scity;
	String sstate;
	String semail;
	int szip;
	int sgpa;
	
	/******** 			Constructors		 ***************/
	StudentServer() throws RemoteException {

	} // end Student(no args) constructor
	
	StudentServer(int id, String fn, String ln, String street, String city, int zip, 
			String email, int gpa) throws RemoteException {
		sid = id;
		sfn = fn;
		sln = ln;
		sstreet = street;
		scity = city;
		szip = zip;
		semail = email;
		sgpa = gpa;
		reg = LocateRegistry.getRegistry();
		reg.rebind("Student", this);
		
	} // end Student(all args) constructor
	/*********			 SelectDB			 ***************/
	public void selectDB(int sid){
		try{
			Connection conn = null;
		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
		
			Statement statement = conn.createStatement();
			String sql = "Select * from Students where ID = '" + sid + "'";
			ResultSet rs = statement.executeQuery(sql);
		
			rs.next();
			
			sfn = rs.getString(2);
			sln = rs.getString(3);
			sstreet = rs.getString(4);
			scity = rs.getString(6);
			szip = rs.getInt(7);
			semail = rs.getString(8);
			sgpa = rs.getInt(9);
			
			rs.close();
			
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf + "\t1");
		} 
		catch(SQLException sql){
			System.out.println(sql + "\t2");	
		}
	}
	/*********			 UpdateDB			 ***************/
	public void updateDB(){
		try{
			Connection conn = null;
		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
		
			Statement statement = conn.createStatement();
			String sql = "Update Students set FirstName = '"+ sfn + "'," +
											 "LastName = '"+ sln +"'," +
											 "Street = '"+ sstreet +"'," +
											 "City = '"+ scity +"'," +
											 "State = '"+ sstate +"'," +
											 "Zip = '"+ szip +"'," +
											 "EMail = '"+ semail +"'," +
											 "GPA = '"+ sgpa +"',";
			System.out.println(sql);
			int n = statement.executeUpdate(sql);
			
			// Process 
			if(n==1){
				System.out.println("Update Complete");
			}else{
				System.out.println("Update Failed");
			}
			
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf + "\t1");
		} 
		catch(SQLException sql){
			System.out.println(sql + "\t2");	
		}
	}
	/*********			 InsertDB			 ***************/
	public void insertDB(int id, String fn, String ln, String street, String city, 
			String state, String email, int zip, int gpa){
		sid = id;
		sfn = fn;
		sln = ln;
		sstreet = street;
		scity = city;
		szip = zip;
		semail = email;
		sgpa = gpa;
		
		try{
			Connection conn = null;
		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
		
			Statement statement = conn.createStatement();
			String sql = "Insert into Students values('" + sid + "','" + sfn 
					+ "','" + sln+ "','" + sstreet + "','" + scity+ "','" 
					+ sstate + "','" + szip + "','" + semail + "','" +sgpa+")";
			System.out.println(sql);
			int n = statement.executeUpdate(sql);
			
			// Process 
			if(n==1){
				System.out.println("Insert Complete");
			}else{
				System.out.println("Insert Failed");
			}
			
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf + "\t1");
		} 
		catch(SQLException sql){
			System.out.println(sql + "\t2");	
		}
	}
	/*********			 DeleteDB			 ***************/
	public void deleteDB(){
		try{
			Connection conn = null;
		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
		
			Statement statement = conn.createStatement();
			String sql = "Delete from Students where ID = '" + sid + "'";
			System.out.println(sql);
			int n = statement.executeUpdate(sql);
			
			// Process 
			if(n==1){
				System.out.println("Update Complete");
			}else{
				System.out.println("Update Failed");
			}
			
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf + "\t1");
		} 
		catch(SQLException sql){
			System.out.println(sql + "\t2");	
		}
	}
	/*********			 Display			 ***************/
	public void display(){
		System.out.println("ID: " + getID());
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: "+ getLastName());
		System.out.println("Address: \n\t" + getStreet() + "\n\t" + getCity() 
				+ ", " + getState() + " " + getZip());
		System.out.println("Email: "+ getEmail());
		System.out.println("GPA: " + getGPA());
	}

	/********* 		getters and setters		 ***************/
	public int getID() {
		return sid;
	}
	
	public String getFirstName() {
		return sfn;
	} // end get FirstName

	public void setFirstName(String fn) {
		sfn = fn;
	} // end setFirstName
	
	public String getLastName() {
		return sln;
	} // end getLastName

	public void setLastName(String ln) {
		sln = ln;
	} // end setLastName

	public String getStreet() {
		return sstreet;
	} // end getStreet

	public void setStreet(String street) {
		sstreet = street;
	} // end setStreet

	public String getCity() {
		return scity;
	} // end getCity

	public void setCity(String city) {
		scity = city;
	} // end setCity
	
	public String getState() {
		return sstate;
	} // end getState

	public void setState(String state) {
		sstate = state;
	} // end setState
	
	public int getZip() {
		return szip;
	} // end getZip

	public void setZip(int zip) {
		szip = zip;
	} // end setZip
	
	public String getEmail() {
		return semail;
	} // end getEmail

	public void setEmail(String email) {
		semail = email;
	} // end setEmail

	public int getGPA() {
		return sgpa;
	} // end getGPA

	public void setGPA(int gpa) {
		sgpa = gpa;	
	} // end setGPA

	public String toString() {
		return "No string here.";
	} // end toString

} // end Student class