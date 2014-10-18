package files;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  5																				*
 * @author: William M. Driver 															*
 * @date: 09/17/2014 																	*
 * @Description: Files in Java 															*
 * 				 Intregate a file														*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/
import java.io.*;

public class FileDetails {

	public FileDetails(String fd) {
		File f1 = new File(fd);
		long size = f1.length();
		boolean readable = f1.canRead();
		boolean writable = f1.canWrite();
		
		/**
		 * This be the meat
		 */
		if(!f1.canExecute()){
			System.out.println(size);
			System.out.println(readable);
			System.out.println(writable);
		}else{
			System.out.println("This file is not executable.");
		} // end if
		/**
		 * change value of canWrite()
		 */
		if(f1.canWrite()){
			f1.setWritable(false);
		}else{
			f1.setWritable(true);
		} // end if 
	} // end constructor

	public static void main(String[] args) {
		FileDetails fd = new FileDetails("assignment");
	} // end main
} // end FileDetails class