package mySwith;

public class My_Switch {

	public static void main(String[] args) {
		System.out.println("Enter Number between 1 und 5: ");
		@SuppressWarnings("resource")
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int eingabeNum = scan.nextInt();
		final double pi = 3.14;
		
		String ausgabe;
		switch(eingabeNum) {
		case 1:
			ausgabe = "One";
		break;
		case 2:
			ausgabe = "two";
			break;
		case 3:
			ausgabe = "three";
			break;
		case 4:
			ausgabe = "four";
			break;
		case 5:
			ausgabe = "five";
			break;
			default:
				ausgabe= "Other";
			break;
		}
		System.out.println("Ausgabe" + "  " + ausgabe);
		System.out.println("pi:  " + pi);
	}

}
