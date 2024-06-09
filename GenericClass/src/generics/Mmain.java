package generics;

public class Mmain {

	public static void main(String[] args) {
		
		MyClass<String> c1 = new MyClass<>();
		c1.mytype = "Ahmad";
		c1.printType();
/**
 * 		

//		MyClass<Integer> c2 = new MyClass<>();
//		c2 = 11;
//		c2.printType();
 */	
		
		/**
		 * Exception in thread "main" java.lang.NullPointerException
	     * at generics.MyClass.printType(MyClass.java:9)
	     * at generics.Mmain.main(Mmain.java:24)
		 */
//		MyClass<Boolean> c4 = new MyClass<Boolean>();
//		c4.printType();
		
		MyClass<Boolean> c3 = new MyClass<Boolean>();
		c3.mytype = true;
		c3.printType();
		
		MyClass2<Double, String, Integer> myc = new MyClass2<>();
		myc.t1 = 1.44;
		myc.t2 = "Diana";
		myc.t3 = 222;
		myc.printTypes();
		
	}

}
