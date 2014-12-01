package sockets;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  Assignment 12														*
 * @author: William M. Driver 												*
 * @date: 11/30/2014 														*
 * @Description: ClientString												*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientString {
	public static void main(String args[]){

		/************************** Behaviors *******************************/
		ObjectOutputStream output = null;
		ObjectInputStream input = null;
		String serverIP = "127.0.0.1";
		Socket connection = null;
		String message;
		try {	
			connection = new Socket(InetAddress.getByName(serverIP), 8888);
			System.out.println(" Connecting to Server");
		
			output = new ObjectOutputStream(connection.getOutputStream());
			output.flush();
			input = new ObjectInputStream(connection.getInputStream());
		
			try {
				message = (String) input.readObject();
				System.out.println(message);
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // end try
			for(int i = 5; i >= 0; i--){
				output.writeInt(i);
				System.out.println("Sent message: \n" + i);
			} // end for loop
			
			output.close();
			input.close();
			connection.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		} // end try
	} // end main
} // end class

