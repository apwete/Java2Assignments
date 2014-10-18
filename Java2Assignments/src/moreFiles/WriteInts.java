package moreFiles;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  6																				*
 * @author: William M. Driver 															*
 * @date: 09/29/2014 																	*
 * @Description: Files in Java 															*
 * 				 Writes Integers to a file												*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/
import java.io.*;

public class WriteInts {

	public WriteInts(String title, int[] myArr) {
		File file = new File(title);
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			for(int i = 1; i < myArr.length; i++){
				output.write(myArr[i]);
				output.newLine();
			} // end for
			output.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} // end try
	} // end constructor
} // end class WriteInts
