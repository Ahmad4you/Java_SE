package nested189;



public class NestedMain {
/**
 * 
 * @param args
 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Company com = new Company();
		com.CompanyName = "";
		
		/**
		 * when class Department is static
		 */
	Company.Department dept = new Company.Department();
	dept.departmentName = "2";
		
	/**
	 * when class Department is Not static
	 */
	
		Company.Building b = com.new Building();
		b.BuildingName = "";
		
		
	}

}
