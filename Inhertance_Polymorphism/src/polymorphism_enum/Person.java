package polymorphism_enum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
	public void getPersonType() {
		System.out.println("Person.....");
	}
	
	public Person(String personName) {
		name = personName;
	}
	
	public String id;
	public String name;
	public String adress;
	public String BirthDate;
	public String phone;
	
	public int CalcDateOfBirth(int birthYear) {
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy");
		int YearNow = Integer.parseInt(f.format(d));
		int YearBD = birthYear;
		int BD = YearNow - YearBD;
		return BD;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
