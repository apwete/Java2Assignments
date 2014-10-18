package moreFiles;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  6																				*
 * @author: William M. Driver 															*
 * @date: 09/29/2014 																	*
 * @Description: Files in Java 															*
 * 				 Reads Integers from a file												*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/
import java.io.*;

public class ReadInts {

	public ReadInts(String title) {
		FileInputStream fileStream;
		try {
			fileStream = new FileInputStream("mydata.dat");
			DataInputStream in = new DataInputStream(fileStream);
       
			while(in.available()<0){
				System.out.println(in.readInt() + "\n");
				in.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Didn't find the file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input issue");
			e.printStackTrace();
		} // end try
	} // end constructor
} // end class
