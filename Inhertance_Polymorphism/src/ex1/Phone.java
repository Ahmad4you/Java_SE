package ex1;

public class Phone {
	public String name;
	private int id;
	private String screenDetails;
	
//	public Phone() {
//		System.out.println("Constructor Class Person");
//	}
	public Phone(String name, int id) {
		this.name = name;
		this.id = id;
		
		System.out.println("Constructor Class Person with parameter");
	}
	
	public int getButtonCount() {
		return id;
	}
	public void setButtonCount(int buttonCount) {
		this.id = buttonCount;
	}
	public String getScreenDetails() {
		return screenDetails;
	}
	public void setScreenDetails(String screenDetails) {
		this.screenDetails = screenDetails;
	}

}
