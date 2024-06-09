package generics;

public class MyClass<MyType> {
	
	public MyType mytype;
	
	public void printType() {
		
		System.out.println(mytype.getClass().getName());
	}

}
