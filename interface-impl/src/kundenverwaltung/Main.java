package kundenverwaltung;

public class Main {

	public static void main(String[] args) {
		
//		IKundenSpeicher kundenSpeicher = new KonkreteKundenSpeicherImplementierung();
		IKundenSpeicher kundenSpeicher = new DBKundenSpeicher();
        Kundenverwaltung verwaltung = new Kundenverwaltung(kundenSpeicher);
		
        verwaltung.aktualisiereAlleKunden();

	}

}
