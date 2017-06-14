package Exception;
/**
 * Analyzing the exception
 * By calling doMore() Function in doSomething() method and calling doSomething()
 * method in main method . 
 * doMore() method have the arithmetic exception.
 * @author Hp
 *
 */
public class ExceptionDemo {

	void doMore() {
		int a = 6;
		int b = 0;
		int c = a / b;      // Generate an Exception 
		System.out.println(c);

	}

	void doSomething() {

		doMore();     // Calling doMore () method 

	}

	public static void main(String[] args) {

		{ 
			ExceptionDemo dos = new ExceptionDemo();    //creating an object
			dos.doSomething();                       // Calling doSomething () method 
		}

	}

}
