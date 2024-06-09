package polymorphism_enum;

public class Doctor extends Employee{
	
	@Override
	public void getPersonType() {
		System.out.println("Employee.....");
	}
	
	public Doctor(String personName) {
		super(personName);
		
	}
	public String doctoralYear;
	public String doctoralTitle;
	public String doctoralDetails;
	
	
	public String getDoctoralYear() {
		return doctoralYear;
	}
	public void setDoctoralYear(String doctoralYear) {
		this.doctoralYear = doctoralYear;
	}
	public String getDoctoralTitle() {
		return doctoralTitle;
	}
	public void setDoctoralTitle(String doctoralTitle) {
		this.doctoralTitle = doctoralTitle;
	}
	public String getDoctoralDetails() {
		return doctoralDetails;
	}
	public void setDoctoralDetails(String doctoralDetails) {
		this.doctoralDetails = doctoralDetails;
	}
	
	
}
