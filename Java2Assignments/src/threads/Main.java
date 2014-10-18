package threads;

/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @Lab:  7																				*
 * @author: William M. Driver 															*
 * @date: 09/29/2014 																	*
 * @Description: Threads in Java 														*
 * 				 Part 3 Make 4 threads with different loop counts						*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

public class Main {
	public static void main(String args[]) {
		
		Thread textend1 = new Thread(new MyTread(250));
		Thread textend2 = new Thread(new MyTread(300));
		
		Thread trunnable1 = new Thread(new MyRunnable(250));
		Thread trunnable2 = new Thread(new MyRunnable(300));
		Thread trunnable3 = new Thread(new MyRunnable(15));
		Thread trunnable4 = new Thread(new MyRunnable(25));
		
		textend1.start();
		textend2.start();
		
		trunnable1.start();
		trunnable2.start();
		trunnable3.start();
		trunnable4.start();
	}
}
