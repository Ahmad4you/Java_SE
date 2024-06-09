package dimensionalArray;

public class MainDimensional {

	public static void main(String[] args) {
		Table t = new Table(3);
		Object r1[] = { 1, "Ahmad", "Leen"};
		Object r2[] = { 2, "Ahmad2", "Leen2"};
		t.addNewRow(r1);                            // addNewRow  r1
		t.addNewRow(r2);
		t.addNewRow(new Object[] {3, "Ahmad3", "Leen3"});
		
		t.editRow(1, 2, "Diana");
//		t.deleteRow(1);
//		System.out.println(t.getValue(1, 2));
//		System.out.println(t.getRow(2)[2]);
		
		
		t.printItems();
	}

}
