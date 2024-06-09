package For_exemple;

public class For_exemple {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner sd = new java.util.Scanner(System.in);
		String stud1 = "";
		String stud2 = "";
		String stud3 = "";
		int g1 = 0, g2 = 0, g3 = 0;
		for (int i = 1; i <= 3; i++) {

			System.out.println("ENter The Name of student" + i + ": ");
			switch (i) {
			case 1:
				stud1 = sd.next();
				break;
			case 2:
				stud2 = sd.next();
				break;
			case 3:
				stud3 = sd.next();
				break;
			}
			System.out.println("ENter The Grade of student" + i + ": ");
			switch (i) {
			case 1:
				g1 = sd.nextInt();
				break;
			case 2:
				g2 = sd.nextInt();
				break;
			case 3:
				g3 = sd.nextInt();
				break;
			}
		}
		String strResult ="";
		for(int x=1; x<=3 ; x++) {
			switch (x) {
			case 1:
				strResult = "Name: " + stud1 + "  Grade: " + g1;
				break;
			case 2:
				strResult = "Name: " + stud2 + "  Grade: " + g2;
				break;
			case 3:
				strResult = "Name: " + stud3 + "  Grade: " + g3;
				break;
			}
			System.out.println(strResult);
		}
	}

}
