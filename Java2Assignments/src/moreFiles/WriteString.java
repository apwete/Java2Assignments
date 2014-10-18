package moreFiles;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  6																				*
 * @author: William M. Driver 															*
 * @date: 09/29/2014 																	*
 * @Description: Files in Java 															*
 * 				 Writes a string to a file												*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/
import java.io.*;

public class WriteString {

	public WriteString(String title, String text) {
		File file = new File(title);
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			
			output.write("Hellow there.");
			output.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} // end try
		System.out.println("Test");
	} // end constructor
} // end class 
