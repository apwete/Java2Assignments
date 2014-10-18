package moreFiles;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  6																				*
 * @author: William M. Driver 															*
 * @date: 09/29/2014 																	*
 * @Description: Files in Java 															*
 * 				 Main Class																*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		int myArr[] = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
		
		WriteInts wi = new WriteInts("mydata.dat", myArr);
		ReadInts ri = new ReadInts("mydata.dat");
		WriteString ws = new WriteString("f1.txt", "Hello World");
	}
}
