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
			Connection conn = null;
		
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:RegistrationDB");
		
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select firstname");
		
			while(rs.next()){
				System.out.println(rs.getString(1));
			} // end while
			
			rs.close();
			conn.close();
		
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf + "\t1");
		} 
		catch(SQLException sql){
			System.out.println(sql + "\t2");	
		}
		
	} // end main
} // end DBTester

