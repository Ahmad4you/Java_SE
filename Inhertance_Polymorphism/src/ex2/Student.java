package ex2;

public class Student extends Person{
	String specialization;

	public Student(String name, String gender, String birthday, boolean isMarried, String specialization) {
		super(name, gender, birthday, isMarried);
		this.specialization = specialization;
		
	}

	@Override
	public void displayInfos() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------------");
		
	}
	

}
