package rmi;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  Assignment 12														*
 * @author: William M. Driver 												*
 * @date: 11/30/2014 														*
 * @Description: ServerMessage												*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class ServerMessage extends UnicastRemoteObject implements Message {
	//Properties
	String mes = "Go Falcons";
	private Registry reg;
	
	// Constructors
	public ServerMessage() throws RemoteException {
		try{
			reg = LocateRegistry.getRegistry();
			reg.rebind("XYZ", this);
			System.out.println("Server Ready to send messages");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	// behaviors
	public String getMessage() throws RemoteException {
		return mes;
	}
	
	public static void main(String args []) throws RemoteException {
		ServerMessage sm1 = new ServerMessage();
	}
}
