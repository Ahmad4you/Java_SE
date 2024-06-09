package employeeimplementation;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	/**
	 * i have an attribute from composition class "address" 
	 * Employee have an address
	 * We talk about composition between two objects when they are dependent each other during they life time.
	 * The salary of a manager depends on project success. 
	 * a project success depends on a manager.
	 * 
	 * 
	 * i have Attribute from aggregation class "insurance --> Versicherung" 
	 * Employee can have or cann't have any insurance
	 * We talk about aggregation between two object when one of them is an owner of the other one.
	 * The relationship between the employees and the address are an aggregation relationship.
	 * 
	 * Association is defined as a structural relationship, 
	 * that conceptually means that the two components are linked to each other. 
	 * 
	 * For example, consider the same example of a Student-Teacher relationship. 
	 * Conceptually speaking, each student can be associated with multiple teachers 
	 * and each teacher can be associated with multiple students.
	 */

	private String name;
	private InsuranceInfo insurance; // case Aggregation(optional)   when 1 to 1
	private AddressInfo address; // case composition(obligation) with an attribute     when 1 to 1
	private List<AddressInfo> _addressInfos; //case composition(obligation) with a List    when 1 to *
	
	// Aggregation relationship must be initialize outer the constructor (optional)  when 1 to *
	private List<InsuranceInfo> _versicherungInfos = new ArrayList<InsuranceInfo>();    
	
	public Employee(String name, String street, String city, String state, String postalCode) {
		this.name = name;
		this.address = new AddressInfo(street, city, state, postalCode); // case composition
//		_addressInfos = new ArrayList<AddressInfo>();  // composition-relationship must be initialize into constructor 1 to *
//		_addressInfos.add(new AddressInfo(address.getStreet(), address.getCity(), address.getState(), address.getPostalCode()));
		
//		address.setCity(city);
//		address.setState(state);
//		address.setPostalCode(postalCode);
//		address.setStreet(street);
	}
	

	public List<AddressInfo> get_addressInfos() {
		return _addressInfos;
	}

	public void set_addressInfos(List<AddressInfo> _addressInfos) {
		this._addressInfos = _addressInfos;
	}

	public List<InsuranceInfo> get_versicherungInfos() {
		return _versicherungInfos;
	}

	public void set_versicherungInfos(List<InsuranceInfo> _versicherungInfos) {
		this._versicherungInfos = _versicherungInfos;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressInfo getAddress() {
		return address;
	}

	public void setAddress(AddressInfo address) {
		this.address = address;
	}

	public InsuranceInfo getInsurance() {
		return insurance;
	}

	public void setInsurance(InsuranceInfo insurance) {
		this.insurance = insurance;
	}


	@Override
	public String toString() {

		StringBuilder st = new StringBuilder();
		st.append(name).append(" ").append(address.getStreet()).append(" ").append(address.getCity()).append(" ")
				.append(address.getState()).append(" ");

		if (insurance != null)
			st.append(insurance.getPolicyId()).append(" ").append(insurance.getPolicyName());

		return st.toString();

	}
	
	
}
