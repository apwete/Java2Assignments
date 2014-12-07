package sockets;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  Assignment 11														*
 * @author: William M. Driver 												*
 * @date: 11/30/2014 														*
 * @Description: ServerString												*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerString {
	public static void main(String args[]){

		/************************** Behaviors *******************************/
		ObjectOutputStream output = null;
		ObjectInputStream input = null;
		ServerSocket server;
		Socket connection = null;
		String message;
		int fromClient;
		try {
			server = new ServerSocket(8888 , 1);
			System.out.println("Waiting . . .");
			connection = server.accept();
			
			System.out.println("Opened streams");
			output = new ObjectOutputStream(connection.getOutputStream());
			output.flush();
			input = new ObjectInputStream(connection.getInputStream());
		
			System.out.println("Sent message: \nHi there client.  Send me some ints.");
			message = "Hi there client.  Send me some ints.";
			output.writeChars(message);
		
			fromClient = input.readInt();
			System.out.println(fromClient);
		} 
		catch (IOException e) {
			e.printStackTrace();
		} // end try
	} // end main
} // end class