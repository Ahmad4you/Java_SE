package nested189;

public class Company {

	public String CompanyName;
	
	class Building{
		public String BuildingName;
		class Floor{
			String FloorName;
		}
	}
	
	static class Department{
		public static String departmentName;
	}
	
	class Lab{
		public String LabName;
		public void Test() {
			Company.this.CompanyName = "";
//			Company.Department.departmentName = "";  // it is static
		}
	}
	
}
