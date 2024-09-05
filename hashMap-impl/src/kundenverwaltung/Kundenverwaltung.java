package kundenverwaltung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kundenverwaltung {
	private Map<Long, Kunde> kunden;
	private IKundenSpeicher kundenSpeicher = new DBKundenSpeicher();
	
	public Kundenverwaltung() {
		kunden = new HashMap<Long, Kunde>();
		
		Kunde k1 = new Kunde(111L, "Ahmad", "Meister");
		Kunde k2 = new Kunde(112L, "Diana", "Musterfrau");
		Kunde k3 = new Kunde(113L, "Max", "Meister");
        Kunde k4 = new Kunde(114L, "Lisa", "Schmidt");
		
		kunden.put(k1.get_KundeNr(), k1);
		kunden.put(k2.get_KundeNr(), k2);
		kunden.put(k3.get_KundeNr(), k3);
		kunden.put(k4.get_KundeNr(), k4);
	}
	
	public void printKundenValue() {
		for(Kunde k: kunden.values()) {
			System.out.println(k);
		}
	}
	
	public void aktualisireAlleKunden() {
		for (Kunde k : kunden.values()) {
			kundenSpeicher.aktuakisieren(k);
		}
	}
	
	public Kunde getKundendaten(Long kundenNr) {
		Kunde k = kunden.get(kundenNr);
		return k;
	}
	
	public void printKundenEntries() {
	    for (Map.Entry<Long, Kunde> entry : kunden.entrySet()) {
	        System.out.println("Kundennummer: " + entry.getKey() + ", Kunde: " + entry.getValue());
	    }
	}
	
	public void printKundenForEach() {
	    kunden.forEach((kundenNr, kunde) -> System.out.println("Kundennummer: " + kundenNr + ", Kunde: " + kunde));
	}
	
	public void aktualisireAlleKundenForEach() {
	    kunden.forEach((kundenNr, kunde) -> kundenSpeicher.aktuakisieren(kunde));
	}
	
	/**
	 *  zeigt, wie Collections (hier eine List) verwendet werden können
	 *  eine List<Kunde> zurückgibt
	 *  
	 * @param anfangsbuchstabe
	 * @return
	 */
	public List<Kunde> getKundenMitNachnamenStartend(char anfangsbuchstabe) {
        List<Kunde> ergebnis = new ArrayList<>();
        
        for (Kunde kunde : kunden.values()) {
            if (kunde.get_Nachname().charAt(0) == Character.toUpperCase(anfangsbuchstabe)) {
                ergebnis.add(kunde);
            }
        }
        
        return ergebnis;
    }

    
    public void printKundenMitNachnamenStartend(char anfangsbuchstabe) {
        List<Kunde> gefundeneKunden = getKundenMitNachnamenStartend(anfangsbuchstabe);
        System.out.println("Kunden mit Nachnamen startend mit '" + anfangsbuchstabe + "':");
        for (Kunde kunde : gefundeneKunden) {
            System.out.println(kunde);
        }
    }
    
    // Neue Methode, die ein Set von einzigartigen Nachnamen zurückgibt
    public Set<String> getEinzigartigeNachnamen() {
        Set<String> nachnamen = new HashSet<>();
        
        for (Kunde kunde : kunden.values()) {
            nachnamen.add(kunde.get_Nachname());
        }
        
        return nachnamen;
    }

    // Methode zum Ausgeben der einzigartigen Nachnamen
    public void printEinzigartigeNachnamen() {
        Set<String> nachnamen = getEinzigartigeNachnamen();
        System.out.println("Einzigartige Nachnamen der Kunden:");
        for (String nachname : nachnamen) {
            System.out.println(nachname);
        }
    }

    
    public void addKunde(Kunde neuerKunde) {
        kunden.put(neuerKunde.get_KundeNr(), neuerKunde);
    }
    
    
}