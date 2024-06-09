package enumEx1;


public class EnumEx1 {

	public static void main(String[] args) {
		
		Employee e = new Employee(Floor.F2, FloorTyp.in);
		e.EmpNo = 1;
		e.EmpName = "Ahmad";
		e.Adress = "Stuttgart";
//		e.workFloor = Floor.F4;
		System.out.println(e.workFloor.num );
		System.out.println(e.type);
		
		Employee e1 = new Employee(Floor.F1, FloorTyp.out);
//		e1.workFloor = Floor.F1;
		System.out.println(e1.workFloor.num +"    "+ e1.workFloor.name);
		System.out.println(e1.type);
		
		System.out.println(Floor.of(3));
	}

}
