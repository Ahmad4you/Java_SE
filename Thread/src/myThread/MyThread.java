package myThread;

public class MyThread {

	public static void main(String[] args) {
		
		Hallo1 h1 = new Hallo1();
		Hallo2 h2 = new Hallo2();
/**
 * without Thread		
 */
//		h1.run();
//		h2.run();
		
		/**
		 * with Tread will to print but mixed together
		 */
		new Thread(h1).start();
		new Thread(h2).start();
	}

}
