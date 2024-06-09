package ex2;

public class Employee extends Person{
	String workPlace;

	public Employee(String name, String gender, String birthday, boolean isMarried, String workPlace) {
		super(name, gender, birthday, isMarried);
		this.workPlace = workPlace;
	}

	@Override
	public void displayInfos() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        
        if(isMarried() == true) {
            System.out.println("is Married: yes");
        }
        else {
            System.out.println("is Married: no");
        }
        
        System.out.println("Work place: " + workPlace);
        System.out.println("---------------------------------");
		
		
	}
	

}
