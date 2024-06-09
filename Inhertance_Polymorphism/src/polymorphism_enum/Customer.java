package polymorphism_enum;

public class Customer extends Person{
	
	@Override
	public void getPersonType() {
		System.out.println("Customer.....");
	}
	
	public Customer(String personName) {
		super(personName);
		
	}
	
	public String shipmentAdress;
	public String shipmentPhone;
	public String likeName;
	
	public String getShipmentAdress() {
		return shipmentAdress;
	}
	public void setShipmentAdress(String shipmentAdress) {
		this.shipmentAdress = shipmentAdress;
	}
	public String getShipmentPhone() {
		return shipmentPhone;
	}
	public void setShipmentPhone(String shipmentPhone) {
		this.shipmentPhone = shipmentPhone;
	}
	public String getLikeName() {
		return likeName;
	}
	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}
	
}
