package threeDimensionalArray;

public class ArrayThreeDim {

	
	public static void main(String[] args) {
		/**
		 * rooms[][][] = 2 building, 3 Floor, 2 rooms
		 */
	
	String rooms[][][] = new String[2][3][2];  
	rooms[0][0][0] = "Ahmad";
	rooms[0][0][1] = "Leen";
	rooms[0][1][0] = "Saly";
	rooms[0][1][1] = "Sabine";
	rooms[0][2][0] = "Soso";
	rooms[0][2][1] = "Dodo";
	
	rooms[1][1][0] = "Diana";
//	System.out.println(rooms[0][1][0]);
	
	for(int b = 0; b < rooms.length ; b++) {
		System.out.println("Building" + (b +1));
		for(int f = 0; f < rooms[b].length ; f++) {
			for(int r = 0; r < rooms[b][f].length ; r++) {
				System.out.print(rooms[b][f][r] + " ; ");
			}
			System.out.println();
		}
		System.out.println();
	}

	}

}
