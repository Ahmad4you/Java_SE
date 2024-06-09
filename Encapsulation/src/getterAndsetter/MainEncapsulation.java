package getterAndsetter;

public class MainEncapsulation {

	public static void main(String[] args) {
		Person p = new Person();
		p.setPersonName("Ahmad");
		p.setPersonBDate("01.03.2003");
		p.setPersonNumber(4567);
		p.setSalary(3400.56);       // + 10% addition
		p.setAdress("Ulm");
		p.setActive(true);
		p.prontInfos();
		
	}

}
