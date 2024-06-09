package getterAndsetter;

public class Person {
	
	private int personNumber;
	private String personCode;
	private String personName;
	private String personBDate;
	private String adress;
	private double salary;
	private boolean isActive;
	
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonBDate() {
		return personBDate;
	}
	public void setPersonBDate(String personBDate) {
		this.personBDate = personBDate;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary + (salary * 0.10);  // + 10% Addition
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void prontInfos() {
		System.out.println("personNumber: " + personNumber);
		System.out.println("personCode: " + personCode);
		System.out.println("personName: " + personName);
		System.out.println("personBDate: " + personBDate);
		System.out.println("adress: " + adress);
		System.out.println("salary: "+ salary);
		System.out.println("isActive: " + isActive);
	}
	
	
}
