package generics;

public class MyClass2<Type1, Type2, Type3> {
	
	public Type1 t1;
	public Type2 t2;
	public Type3 t3;
	
	public void printTypes() {
		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());
		System.out.println(t3.getClass().getName());
		
	}

}
