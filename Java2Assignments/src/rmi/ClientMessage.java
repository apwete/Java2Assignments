package rmi;

/****************************************************************************
 * @Class: CIST 2372 Java 2 												*
 * @Term: Fall 2014 														*
 * @Lab:  Assignment 12														*
 * @author: William M. Driver 												*
 * @date: 11/30/2014 														*
 * @Description: ClientMessage												*
 *  																		*
 * @version: 1.0 															* 
 * @update: 																*
 ****************************************************************************/

import java.rmi.*;
import java.rmi.registry.*;

public class ClientMessage {
	//Properties
	private String s;
	private Message m1;
	
	//Construcors
	public ClientMessage(){
		try{
			Registry reg;
			reg = LocateRegistry.getRegistry("localhost");
			
			m1 = (Message)reg.lookup("XYZ");
			s = m1.getMessage();
			System.out.println(s);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	//Behaviors
	public static void main(String args []){
		ClientMessage cm;
		cm = new ClientMessage();
	}
}
