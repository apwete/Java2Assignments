package dbBusinessObject;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  9																	*
 * @author: William M. Driver 												*
 * @date: 10/22/2014 														*
 * @Description: DB Main		 											*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

public class Main {

	public static void main(String[] args) {
		Student student;
		
		student = new Student();
		//Test Select
		student.selectDB(1);
		student.display();
		//Test Insert
		student.insertDB(35, "LLL", "MMM", "NNN", "OOO", "PPP", "QQQ", 999, 4);
		student.selectDB(35);
		student.display();
		//Test Update
		student.selectDB(35);
		student.setFirstName("Billy");
		student.updateDB();
		//Test Delete
		student.selectDB(35);
		student.deleteDB();
		student.display();
		
	} // end main class
} // end Main class
