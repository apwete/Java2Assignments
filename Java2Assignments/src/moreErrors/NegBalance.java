package moreErrors;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  4																				*
 * @author: William M. Driver 															*
 * @date: 09/09/2014 																	*
 * @Description: Error Handling 														*
 * 		part2  This is the Exception class  											*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

public class NegBalance extends Exception {
	String msg = "You any got no money";
	
	public String toString(){
		return msg;
	}
}
