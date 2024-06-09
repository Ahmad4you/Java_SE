package polymorphism_enum;

public class Main {
	
	static void getType(Person p) {       // static because main is static
		                                   // Person p is the Parent_Class
		p.getPersonType();
	}
	
	
	public enum Floor {
		F1, F2, F3, F4;
		
		private Floor(){
			System.out.println("Enum Floor");   //to run four times because we have four Items into enum
		}
	}
	

	public static void main(String[] args) {
		
		Person p = new Person("Ahmad");
		Customer c = new Customer("Amr");
		Student s = new Student("Ali");
		Employee e = new Employee("Diana");
		Doctor d = new Doctor("Leen");
		
		
		getType(p);
		getType(c);
		getType(s);
		getType(e);
		getType(d);
		
		e.workFloor = Floor.F1;      // Initialization is hier in e Employee
		d.workFloor = Floor.F2;     //  Because  d doctor extends e
		
		System.out.println(e.workFloor);
		System.out.println(d.workFloor);
		
		/*
		p.getPersonType();
		c.getPersonType();
		s.getPersonType();
		e.getPersonType();
		d.getPersonType();
		*/
		
		/*
		System.out.println(p.name);
		System.out.println(c.name);
		System.out.println(s.name);
		System.out.println(e.name);
		System.out.println(d.name);
		*/
	}

}
