package errorHandling;


/****************************************************************************************
 * @Class: CIST 2372 Java 2 															*
 * @Term: Fall 2014 																	*
 * @author: William M. Driver 															*
 * @date: 09/03/2014 																	*
 * @Description: Error Handling 														*
 * 		part 1  																		*
 *  																					*
 * @version: 1.0 																		* 
 * @update: 																			*
 ****************************************************************************************/

/*
   What happens?
		When you run the first block of code the program crashes, and it throws an error 

		Exception in thread "main" java.lang.ArithmeticException: / by zero
			at errorHandling.TestExceptions.main(TestExceptions.java:11)

	Now add try/catch blocks to catch these exceptions?
		The same thing happened
		
	Is there another way that you can prevent a run-time error without
	Using try-catch blocks?
		Yes, you can test using debuggers or print statements.  You can also use if 
		statements to mitigate user errors.
*/

public class TestExceptions {

	public static void main(String[] args) {
		// Declarations
		int[] myArr = new int[10];
		int x,y,z;
		x=0;
		y=10;
		z=y/x;
		
		try{
			myArr[10] = 0;
		}catch(Exception e){
			e.toString();
		}

	}

}
