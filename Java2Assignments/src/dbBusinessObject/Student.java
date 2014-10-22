package dbBusinessObject;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  9																	*
 * @author: William M. Driver 												*
 * @date: 10/22/2014 														*
 * @Description: DB Student Object 											*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

public class Student {
	// Declarations
	String fn = null;
	String ln = null;
	String street = null;
	String email = null;
	String city = null;
	int zip;
	int gpa;
	
	Student() {

	} // end Student(no args) constructor
	
	Student(String fn, String ln, String street, String city, int zip, 
			String email, int gpa) {

	} // end Student(all args) constructor
	
	protected void getFirstName() {
		System.out.println(fn);
	} // end get FirstName

	protected String setFirstName(String fn) {
		this.fn = fn;
		return fn;
	} // end setFirstName
	
	protected void getLastName() {
		System.out.println(ln);
	} // end getLastName

	protected String setLastName(String ln) {
		this.ln = ln;
		return ln;
	} // end setLastName

	protected void getStreet() {
		System.out.println(street);
	} // end getStreet

	protected String setStreet(String street) {
		this.street = street;
		return street;
	} // end setStreet

	protected void getCity() {
		System.out.println(city);
	} // end getCity

	protected String setCity(String city) {
		this.city = city;
		return city;
	} // end setCity

	protected void getZip() {
		System.out.println(zip);
	} // end getZip

	protected int setZip(int zip) {
		this.zip = zip;
		return zip;
	} // end setZip
	
	protected void getEmail() {
		
		System.out.println(email);
	} // end getEmail

	protected String setEmail(String email) {
		this.email = email;
		return email;

	} // end setEmail

	protected void getGPA() {
		System.out.println(gpa);
	} // end getGPA

	protected int setGPA(int gpa) {
		this.gpa = gpa;
		return gpa;

	} // end setGPA

	public String toString() {
		return "Need to finish toString()";
	} // end toString
	
} // end Student class