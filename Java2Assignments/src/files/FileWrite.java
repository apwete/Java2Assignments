package files;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  5																				*
 * @author: William M. Driver 															*
 * @date: 09/17/2014 																	*
 * @Description: Files in Java 															*
 * 				 Create and write to a file												*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

import java.io.*;

public class FileWrite {

	public FileWrite(String fname, String text) throws Exception {
		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream(fname);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		InputStream in = null;
		byte barr[] = new byte[8];
		
		for(int i =0;i<barr.length;i++){
			try {
				file.write(barr[i]);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(in.read(barr));	
	}

	public static void main(String[] args) throws Exception {
			FileWrite fw = new FileWrite("myfile.txt", "Sup Dog?");
	}
}
