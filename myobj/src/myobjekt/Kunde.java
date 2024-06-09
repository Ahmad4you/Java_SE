package myobjekt;

public class Kunde {
	public static int kundeNr =0;
	public static String kundeName= "";
	public static double kundeBeitrag= 0;
	
	public static void printKuneNr() {
		System.out.println("kundeNr: " + kundeNr);
	}
	public static void printkundeName() {
		System.out.println("kundeName: " + kundeName);
	}
	public static void printkundeBeitrag() {
		System.out.println("kundeBeitrag: " + kundeBeitrag);
	}
}
