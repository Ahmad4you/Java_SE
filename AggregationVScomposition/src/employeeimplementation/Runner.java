package employeeimplementation;

import java.util.ArrayList;
import java.util.List;


public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * 
		 * you can not Employee anlegen ohne AdressInfo mit zu definieren (composition)
		 * 
		 * you can not InsuranceInfo anlegen ohne Employee zu definieren (aggregation)
		 */
		
		// add via composition
		System.out.println("------------------add via composition:------------------");
		Employee aEmployee = new Employee("Ahmad", "Rosenstr", "Ulm", "Baden-Württemberg", "5055");
		System.out.println(aEmployee);

		
		Employee aEmployee2 = new Employee("Lolo", "Rosenstr", "Ulm", "Baden-Württemberg", "5033");
		
		
		// add via aggregation
		System.out.println("-----------------add via aggregation:------------------");
		InsuranceInfo versicherung1 = new InsuranceInfo();
		versicherung1.setPolicyId("1001");
		versicherung1.setPolicyName("Life Insurance policy");
		
		InsuranceInfo versicherung2 = new InsuranceInfo();
		versicherung2.setPolicyId("1002");
		versicherung2.setPolicyName("Car Insurance policy");

		aEmployee.setInsurance(versicherung1); // add insurance to an Employee
		System.out.println(aEmployee);
		
		List<InsuranceInfo> lstInsuranceInfos = new ArrayList<InsuranceInfo>();
		lstInsuranceInfos.add(versicherung1);
		lstInsuranceInfos.add(versicherung2);
		
		System.out.println("--------------add via aggregation all InsuraceInfos----------------");
		aEmployee2.set_versicherungInfos(lstInsuranceInfos);
		System.out.println();
		
		for (InsuranceInfo insuranceInfo : aEmployee2.get_versicherungInfos()) {
			System.out.println(insuranceInfo);
		}
//		Test.kuerzeip("2001:0db8:0000:08d3:0000:8a2e:0070:7344");
	}

}
