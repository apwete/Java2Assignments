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

	} //Student(no args) constructor
	
	Student(String fn, String ln, String street, String city, int zip, 
			String email, int gpa) {

	} //Student(all args) constructor
	
	protected void getFirstName() {
		System.out.println(fn);
	} // get FirstName

	protected String setFirstName(String fn) {
		this.fn = fn;
		return fn;
	} // setFirstName
	
	protected void getLastName() {
		System.out.println(ln);
	} // getLastName

	protected String setLastName(String ln) {
		this.ln = ln;
		return ln;
	} // setLastName

	protected void getStreet() {
		System.out.println(street);
	} // getStreet

	protected String setStreet(String street) {
		this.street = street;
		return street;
	} // setStreet

	protected void getCity() {
		System.out.println(city);
	} // getCity

	protected String setCity(String city) {
		this.city = city;
		return city;
	} // setCity

	protected void getZip() {
		System.out.println(zip);
	} // getZip

	protected int setZip(int zip) {
		this.zip = zip;
		return zip;
	} // setZip
	
	protected void getEmail() {
		
		System.out.println(email);
	} // getEmail

	protected String setEmail(String email) {
		this.email = email;
		return email;

	} // setEmail

	protected void getGPA() {
		System.out.println(gpa);
	} // getGPA

	protected int setGPA(int gpa) {
		this.gpa = gpa;
		return gpa;

	} // setGPA

	public String toString() {
		return "Need to finish toString()";
	} // toString
} // Student class