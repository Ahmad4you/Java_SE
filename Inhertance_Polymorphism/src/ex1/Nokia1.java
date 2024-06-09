package ex1;

public class Nokia1 extends Phone {
	String camera;
	String bluetooth;
	
	public Nokia1(String name, String bluetooth) {
		super(name, 0);		
		this.bluetooth = bluetooth;
		
		System.out.println("Constructor Nokia1 with parameter");
		
	}

}
