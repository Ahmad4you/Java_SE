package myobjekt;

public class Personal {

	public static void main(String[] args) {
		Kunde.kundeNr = 011;  // hier wird keine Objekt erstellt
		Kunde.printKuneNr();
		
		Kunde.kundeName= "Ahmad";
		Kunde.printkundeName();
		
		Gp gb1 = new Gp();   // hier wird eine Objekt erstellt
		gb1.GbZahl=2;
		gb1.printGbZahl();
		
		Gp gb2 = new Gp();
		gb2.printGb();
		
	}

}
