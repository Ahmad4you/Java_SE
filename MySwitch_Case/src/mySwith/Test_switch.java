package mySwith;

public class Test_switch {

	public static void main(String[] args) {
		System.out.println("enter Zahl zwischen 1 und 5: ");
		@SuppressWarnings("resource")
		java.util.Scanner scan1 = new java.util.Scanner(System.in);
		int eingabeZahl = scan1.nextInt();

		String ausgabe;
		switch (eingabeZahl) {
		case 1:
			ausgabe = "One";
			break;
		case 2:
			ausgabe = "tow";
			break;
		case 3:
			ausgabe = "Three";
			break;
		case 4:
			ausgabe = "Four";
			break;
		case 5:
			ausgabe = "Five";
			break;
		default:
			ausgabe = "Other";
			break;
		}
		System.out.println("Ausgabe: " + ausgabe);
	}

}
