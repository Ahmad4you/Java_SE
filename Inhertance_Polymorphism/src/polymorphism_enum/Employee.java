package polymorphism_enum;

import polymorphism_enum.Main.Floor;

public class Employee extends Person{
	
	public Floor workFloor;               // initialize enum Floor
	
	@Override
	public void getPersonType() {
		System.out.println("Employee.....");
	}
	
	public Employee(String personName) {
		super(personName);
		
	}
	
	public String ssN;               //social security number
	public String HireDate;         // Eintrit Date
	public int startSalary;
	public int CurrentSalary;
	
	public String getSsN() {
		return ssN;
	}
	public void setSsN(String ssN) {
		this.ssN = ssN;
	}
	public String getHireDate() {
		return HireDate;
	}
	public void setHireDate(String hireDate) {
		HireDate = hireDate;
	}
	public int getStartSalary() {
		return startSalary;
	}
	public void setStartSalary(int startSalary) {
		this.startSalary = startSalary;
	}
	public int getCurrentSalary() {
		return CurrentSalary;
	}
	public void setCurrentSalary(int currentSalary) {
		CurrentSalary = currentSalary;
	}
	
}
