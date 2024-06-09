package polymorphism_enum;

public class Student extends Person{
	
	@Override
	public void getPersonType() {
		System.out.println("Student.....");
	}
	
	public Student(String personName) {
		super(personName);
		
	}
	public String cardId;
	public String branchName;
	
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
