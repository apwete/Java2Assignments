package files;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  5																				*
 * @author: William M. Driver 															*
 * @date: 09/17/2014 																	*
 * @Description: Files in Java 															*
 * 				 Read from a file														*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

import java.io.*;

public class FileRead {

	public FileRead(String fname) {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(fname);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // end FileNotFound
		
		try {
			for(int i=0; i<fin.read(); i++ ){
				System.out.print((char)fin.read());
			}
//			System.out.println(fin.read(barr));
		} catch (IOException e) {
			e.printStackTrace();
		} // end IO try	
	} // end constructor

	public static void main(String[] args) {
		FileRead fr = new FileRead("assignment.txt");
	} // end main

}
