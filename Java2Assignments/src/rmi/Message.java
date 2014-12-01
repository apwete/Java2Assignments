package rmi;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  Assignment 12														*
 * @author: William M. Driver 												*
 * @date: 11/30/2014 														*
 * @Description: Message													*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import java.rmi.*;

public interface Message extends Remote {
	public String getMessage() throws RemoteException;
}
