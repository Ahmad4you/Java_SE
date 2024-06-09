package dimensionalArray;

public class Table {
	
	public int columns;
	public Object [][] Items;
	
	public Table(int columns) {
		this.columns = columns;
		Items = new Object[0][columns];
	}
	public void addNewRow(Object row[]) {
		Object TempItems[][] = Items;   //Data sind hier into TempItems[]
		Items = new Object[Items.length +1][columns]; // Items[] is Now leer + One new row
		for(int x = 0; x < TempItems.length; x++) {
			Items[x] = TempItems[x];       // to return Data into Items[] from TempItems[]
		}
		Items[Items.length -1] = row;       //to arrive last Index into Items-fix-addNewRow
				
	}
	public void printItems() {
		for(Object objs[] : Items) {
			for(Object obj : objs) {
				System.out.print(obj + " ; ");
			}
			System.out.println();
		}
	}
	public void editRow(int rowIndex, int columnIndex, Object newData) {
		Items[rowIndex][columnIndex] = newData;
	}
	public void deleteRow(int rowIndex) {
		Object TempItems[][] = Items;
		Items = new Object[Items.length -1][columns];
		int y = 0 ;                //es muss auser for() definiert damit nicht 0 bleibt
		for(int x=0 ; x < TempItems.length; x++) {
			if(x != rowIndex) {
				Items[y] = TempItems[x];
				y++;
			}
		}
	}
	public Object getValue(int rowIndex, int columnIndex) {
		return Items[rowIndex][columnIndex];
	}
	public Object[] getRow(int rowIndex) {
		return Items[rowIndex];
	}

}
