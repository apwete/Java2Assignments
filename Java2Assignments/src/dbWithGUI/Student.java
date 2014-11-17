package dbWithGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  9																	*
 * @author: William M. Driver 												*
 * @date: 11/11/2014 														*
 * @Description: DB Student Object 											*
 *  																		*
 * @version: 1.0 															* 
 * @update: v: 1.1 - housekeeping											*
 * 			v. 1.2 - Add DB connections to button listeners, Student Object	* 
 * 					 and inputs for address									*
 ****************************************************************************/

public class Student {
	/******** 			Behaviors			****************/
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
	Student() {

	} // end Student(no args) constructor
	
	Student(int id, String fn, String ln, String street, String city, int zip, 
			String email, int gpa) {
		sid = id;
		sfn = fn;
		sln = ln;
		sstreet = street;
		scity = city;
		szip = zip;
		semail = email;
		sgpa = gpa;
	} // end Student(all args) constructor
	/*********			 SelectDB			 ***************/
	protected void selectDB(int sid){
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
	protected void updateDB(){
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
	protected void insertDB(int id, String fn, String ln, String street, String city, 
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
	protected void deleteDB(){
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
	protected void display(){
		System.out.println("ID: " + getID());
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: "+ getLastName());
		System.out.println("Address: \n\t" + getStreet() + "\n\t" + getCity() 
				+ ", " + getState() + " " + getZip());
		System.out.println("Email: "+ getEmail());
		System.out.println("GPA: " + getGPA());
	}

	/********* 		getters and setters		 ***************/
	private int getID() {
		return sid;
	}
	
	protected String getFirstName() {
		return sfn;
	} // end get FirstName

	protected void setFirstName(String fn) {
		sfn = fn;
	} // end setFirstName
	
	protected String getLastName() {
		return sln;
	} // end getLastName

	protected void setLastName(String ln) {
		sln = ln;
	} // end setLastName

	protected String getStreet() {
		return sstreet;
	} // end getStreet

	protected void setStreet(String street) {
		sstreet = street;
	} // end setStreet

	protected String getCity() {
		return scity;
	} // end getCity

	protected void setCity(String city) {
		scity = city;
	} // end setCity
	
	protected String getState() {
		return sstate;
	} // end getState

	protected void setState(String state) {
		sstate = state;
	} // end setState
	
	protected int getZip() {
		return szip;
	} // end getZip

	protected void setZip(int zip) {
		szip = zip;
	} // end setZip
	
	protected String getEmail() {
		return semail;
	} // end getEmail

	protected void setEmail(String email) {
		semail = email;
	} // end setEmail

	protected int getGPA() {
		return sgpa;
	} // end getGPA

	protected void setGPA(int gpa) {
		sgpa = gpa;	
	} // end setGPA

	public String toString() {
		return "No string here.";
	} // end toString
	
} // end Student class