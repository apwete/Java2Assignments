package threads;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  7																				*
 * @author: William M. Driver 															*
 * @date: 09/29/2014 																	*
 * @Description: Threads in Java 														*
 * 				 Part 1 Extend Tread													*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

public class MyTread extends Thread{
	private int num;
	
	public MyTread(int i) {
		num = i;
	}

	public void run(){	
		for(int i = 1; i<num; i++){
			System.out.println("Thread Running ... " + num);
		}
	}
}
