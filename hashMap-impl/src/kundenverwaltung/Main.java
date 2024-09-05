package kundenverwaltung;

public class Main {

	public static void main(String[] args) {
        Kundenverwaltung verwaltung = new Kundenverwaltung();
        
        // Ausgabe der ursprünglichen einzigartigen Nachnamen
        verwaltung.printEinzigartigeNachnamen();
        
        // Hinzufügen eines neuen Kunden mit einem bereits vorhandenen Nachnamen
        Kunde neuerKunde = new Kunde(115L, "Anna", "Meister");
        verwaltung.addKunde(neuerKunde);
        
        System.out.println("\nNach Hinzufügen eines neuen Kunden:");
        // Erneute Ausgabe der einzigartigen Nachnamen
        // Haupteigenschaften von Sets: Sie enthalten keine Duplikate!
        verwaltung.printEinzigartigeNachnamen();


	}

}
