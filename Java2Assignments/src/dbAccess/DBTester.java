package dbAccess;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  8																	*
 * @author: William M. Driver 												*
 * @date: 10/15/2014 														*
 * @Description: DB Access		 											*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import java.sql.*;

public class DBTester {

	public static void main(String[] args) {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			Connection conn = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
		
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select firstname");
		
			while(rs.next()){
				System.out.println(rs.getString(1));
			} // end while
		
		}catch(SQLException sql){
			System.out.println(sql + "\t1");
			
		} catch (ClassNotFoundException cnf) {
			System.out.println(cnf + "\t2");
		} // end try
		
	} // end main
} // end DBTester

